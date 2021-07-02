package view;

import domain.food.Pork;
import domain.food.SourVegDumpling;
import domain.food.VegDumpling;
import service.FoodService;
import service.FormService;
import service.PayService;
import utils.DateUtility;
import utils.Utility;

import java.io.IOException;

/**
 * @author Zxc
 * @version 1.0
 */

@SuppressWarnings({"all"})
public class CustomerView {

    private double veg = 0;
    private double sveg = 0;
    private double pork = 0;
    private static FoodService foodService = new FoodService();
    private static PayService payService = new PayService();
    private static FormService formService = new FormService();
    private boolean loop = true;
    public static double finalBill=0.0;
    public static double preBill=0.0;
    public static double sumBill=0.0;
    public static double sumDiscountBill=0.0;
    public static int sumForm=0;
    public static double[] bundledFood = new double[3];
    public static double[] sumFood = new double[3];
    public static double[] sumFoodBill = new double[3];
    private char key = ' ';
    private double[] food;
    private String ID = null;
    public static String whatDiscount = null;

    public void mainMenu() throws IOException {
        do {
        System.out.println("===============孙二娘餐馆===============");
        System.out.println("\t\t\t1. 菜 单 点 菜");
        System.out.println("\t\t\t2. 查看订单信息");
        System.out.println("\t\t\t3. 退 出 系 统");
            switch (key = Utility.choice$123().charAt(0)){
                case '1':   order();
                    break;
                case '2':   findForm();
                    break;
                case '3':   signOut();
                    break;
                default:
                    break;
            }
        } while (loop);
    }

    public void order() throws IOException {

        boolean switchLoop = true;


        System.out.println("===================菜 单===================");
        System.out.println("\t\t\t\t  主  食");
        System.out.println("1. 水饺：素三鲜  \t\t\t12元/斤\t余" + VegDumpling.TOL+"份");
        System.out.println("2. 水饺：酸菜油吱啦  \t\t12元/斤\t余" + SourVegDumpling.TOL+"份");
        System.out.println("3. 猪肉：\t\t\t\t\t16元/斤\t余" + Pork.TOL+"份");

        do {
            System.out.print("请点餐(1/2/3)，退出输入0：");
            char k = Utility.choice$0123().charAt(0);
            switch(k){
                case'1':
                    System.out.print("素三鲜水饺余"+ VegDumpling.TOL+"份，请输入份量(0.5斤为最小单位)：");
                    veg += Utility.readDouble();
                    break;
                case'2':
                    System.out.print("酸菜油吱啦水饺余"+ SourVegDumpling.TOL+"份，请输入份量(0.5斤为最小单位)：");
                    sveg += Utility.readDouble();
                    break;
                case '3':
                    System.out.print("猪肉余"+ Pork.TOL+"份，请输入份量(0.5斤为最小单位)：");
                    pork += Utility.readDouble();
                    break;
                case '0':
                    return;
                default:
                    break;
            }
            System.out.print("是否继续点餐，");
            if(Utility.readConfirmSelection().equalsIgnoreCase("n")){
                switchLoop = false;
            }
        } while (switchLoop);
        if (foodService.isOrder(veg,sveg,pork)&&pay(foodService.getBill(veg,sveg,pork))) {
            foodService.updateFoodTOL(veg,sveg,pork);
            preBill=(veg+sveg)*12+pork*16;
            if (finalBill>100){
                bundled();
            }
            System.out.println("点单成功！");
            sumBill+=finalBill;
            sumForm++;
            sumDiscountBill+=(preBill-finalBill);
            food=new double[3];
            food[0]=veg;
            food[1]=sveg;
            food[2]=pork;
            for (int i = 0; i < sumFood.length; i++) {
                sumFood[i]+=food[i];
            }
            System.out.println("订单编号\t\t排队序号\t\t菜品详情\t\t订单生成时间\t\t订单状态\t\t订单完成时间\t\t订单总金额" +
                    "\t\t折扣信息\t\t实付款\t\t会员编号");
            System.out.println(formService.creatForm(formService.creatFoodList(food), DateUtility.getDateymdhms(),
                    preBill, whatDiscount, finalBill, ID == null ? "无会员" : ID));
            veg=0;sveg=0;pork=0;whatDiscount=null;ID=null;
        }
        return;
    }

    public boolean pay(double bill) throws IOException {
        boolean i=false;
        System.out.print("请选择是否会员结账(Y/N)：");
        if (Utility.confirmSelection().equalsIgnoreCase("n")){
            System.out.println("账单：共计"+bill+"元");
            if (payService.pay(bill)) {
                System.out.println("支付成功！");
                foodService.upFoodBill(veg,sveg,pork);
                finalBill=bill;
                i=true;
            }
        }else{
            System.out.println("请选择：1.已有会员\n\t2.注册会员");
            if (Utility.choice$12().charAt(0)=='2') {
                if (payService.creatCard()){
                    System.out.println("注册成功！");
                }else System.out.println("注册失败！");
            }
            System.out.print("请输入会员卡号：");
            ID= Utility.readString(5);
            if (payService.cardPay(ID,bill)) {
                System.out.println("支付成功！");
                if (whatDiscount == null) {
                    foodService.upFoodBill(veg, sveg, pork);
                } else {
                    foodService.upFoodBill(veg, sveg, pork, Double.parseDouble(whatDiscount));
                }
                i=true;
            }else System.out.println("支付失败！");

        }
        return i;

    }

    public void bundled() throws IOException {

        double veg = 0;
        double sveg = 0;
        double pork = 0;

        System.out.println("消费超100元，可免费选取10元以内菜品！");
        do {
            System.out.println("1. 水饺：素三鲜  \t\t\t12元/斤\t余" + VegDumpling.TOL + "份");
            System.out.println("2. 水饺：酸菜油吱啦  \t\t12元/斤\t余" + SourVegDumpling.TOL + "份");
            System.out.println("3. 猪肉：\t\t\t\t\t16元/斤\t余" + Pork.TOL + "份");
            System.out.print("请点餐(1/2/3)，退出输入0：");
            char k = Utility.choice$0123().charAt(0);
            switch (k) {
                case '1':
                    System.out.print("素三鲜水饺余" + VegDumpling.TOL + "份，请输入份量(0.5斤为最小单位)：");
                    veg += Utility.readDouble();
                    break;
                case '2':
                    System.out.print("酸菜油吱啦水饺余" + SourVegDumpling.TOL + "份，请输入份量(0.5斤为最小单位)：");
                    sveg += Utility.readDouble();
                    break;
                case '3':
                    System.out.print("猪肉余" + Pork.TOL + "份，请输入份量(0.5斤为最小单位)：");
                    pork += Utility.readDouble();
                    break;
                case'0':
                    return ;
                default:
                    break;
            }
            if (foodService.getBill(veg,sveg,pork)>10) {
                System.out.println("菜品金额超出10元，请重新选择。");
            }else if (foodService.isOrder(veg,sveg,pork)){
                foodService.updateFoodTOL(veg,sveg,pork);
                this.veg += veg;
                this.sveg += sveg;
                this.pork += pork;
                bundledFood[0]+=veg;
                bundledFood[1]+=sveg;
                bundledFood[2]+=pork;
                return;
            }
        } while (true);
    }

    public void findForm() throws IOException {
        do {
            System.out.print("请输入订单编号：");
            String findKey = Utility.readString(3);
            if (!formService.findForm(findKey)) {
                System.out.print("订单不存在，是否继续查询，");
                if (Utility.readConfirmSelection().equalsIgnoreCase("Y")){
                    continue;
                }
            }
            return;
        } while (true);
    }

    /**
     * 功能：确认用户的退出操作，调用readConfirmSelection方法。
     * @throws IOException
     */
    public void signOut() throws IOException {
        System.out.print("确认退出吗？");
        if(Utility.readConfirmSelection().equalsIgnoreCase("y")){
            loop = false;
        }
    }
}
