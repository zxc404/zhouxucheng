package view;

import domain.food.Pork;
import domain.food.SourVegDumpling;
import domain.food.VegDumpling;
import service.FormService;
import utils.Utility;

import java.io.IOException;

/**
 * @author Zxc
 * @version 1.0
 */
public class ShopkeeperView {

    private char key = ' ';
    private boolean loop = true;
    private FormService formService = new FormService();
    String[] foodName = {"素三鲜水饺","酸菜油吱啦水饺","猪肉"};
    private double[] foodPrice = {12,12,16};


    public void shopkeeperMenu() throws IOException {
        do {
            System.out.println("===============孙二娘餐馆===============");
            System.out.println("\t\t\t1. 食 品 折 扣");
            System.out.println("\t\t\t2. 食品份额设置");
            System.out.println("\t\t\t3. 未完成订单显示");
            System.out.println("\t\t\t4. 总营收、单量、平均消费额、总折扣金额");
            System.out.println("\t\t\t5. 各菜品销售详情");
            System.out.println("\t\t\t6. 赠送菜品信息");
            System.out.println("\t\t\t7. 订单完成更新");
            System.out.println("\t\t\t8. 退 出 系 统");
            System.out.print("输入您的选择：");
            switch (key = Utility.readChar()){
                case '1':   showDiscount();
                    break;
                case '2':   setFood();
                    break;
                case '3':   showNotYetForm();
                    break;
                case '4':   showDayDetail();
                    break;
                case '5':   showFoodDetail();
                    break;
                case '6':   showBundledDetail();
                    break;
                case '7':   setForm();
                    break;
                case '8':   signOut();
                    break;
                default:
                    break;
            }
        } while (loop);
    }

    public void showDiscount() throws IOException {
        System.out.println("================折扣信息================");
        System.out.println("1.素三鲜水饺:\t\t"+ VegDumpling.DISCOUNT+"折");
        System.out.println("2.酸菜油吱啦水饺:\t"+ SourVegDumpling.DISCOUNT+"折");
        System.out.println("3.猪肉:\t\t\t\t"+ Pork.DISCOUNT+"折");
        System.out.print("是否修改折扣信息,");
        if(Utility.readConfirmSelection().equalsIgnoreCase("y")){
           boolean switchLoop=true;
           double discount;
            do {
                System.out.print("请选择(1/2/3)，退出请输入0：");
                char k = Utility.choice$0123().charAt(0);
                switch(k){
                    case'1':
                        System.out.print("素三鲜水饺折扣:");
                        discount= Utility.readDouble();
                        if (!(discount>=0&discount<=10)){
                            System.out.println("折扣设置超出范围！请重新设置");
                            break;
                        }
                        VegDumpling.DISCOUNT=discount;
                        break;
                    case'2':
                        System.out.print("酸菜油吱啦水饺折扣:");
                        discount= Utility.readDouble();
                        if (!(discount>=0&discount<=10)){
                            System.out.println("折扣设置超出范围！请重新设置");
                            break;
                        }
                        SourVegDumpling.DISCOUNT=discount;
                        break;
                    case '3':
                        System.out.print("猪肉折扣:");
                        discount= Utility.readDouble();
                        if (!(discount>=0&discount<=10)){
                            System.out.println("折扣设置超出范围！请重新设置");
                            break;
                        }
                        Pork.DISCOUNT=discount;
                        break;
                    case'0':
                        switchLoop=false ;
                    default:
                        break;
                }
                System.out.print("是否继续设置，");
                if(Utility.readConfirmSelection().equalsIgnoreCase("n")){
                    switchLoop = false;
                }
            } while (switchLoop);
            System.out.println("================折扣信息================");
            System.out.println("1.素三鲜水饺:\t\t"+ VegDumpling.DISCOUNT+"折");
            System.out.println("2.酸菜油吱啦水饺:\t"+ SourVegDumpling.DISCOUNT+"折");
            System.out.println("3.猪肉:\t\t\t\t"+ Pork.DISCOUNT+"折");
        }

    }

    public void setFood(){
        System.out.println("==============食品份额设置==============");
        System.out.print("素三鲜水饺份额：");
        VegDumpling.TOL= Utility.read$0Double();
        System.out.print("酸菜油吱啦水饺份额：");
        SourVegDumpling.TOL= Utility.read$0Double();
        System.out.print("猪肉份额：");
        Pork.TOL= Utility.read$0Double();
    }

    public void showNotYetForm(){
        System.out.println("==============未完成订单==============");
        System.out.println("订单编号\t\t排队序号\t\t菜品详情\t\t订单生成时间\t\t订单状态\t\t订单完成时间\t\t订单总金额\t\t折扣信息\t\t实付款\t\t会员编号");
        formService.showNotYet();
    }

    public void showDayDetail(){
        System.out.println("=============一天内销售情况=============");
        System.out.println("总营收\t单量\t平均消费额\t总折扣金额");
        System.out.println(CustomerView.sumBill+"\t"+ CustomerView.sumForm+"\t"+
                (CustomerView.sumBill/ CustomerView.sumForm)+"\t"+ CustomerView.sumDiscountBill);
    }

    public void showFoodDetail() throws IOException {
        double doutemp;
        String temp;
        char ch=' ';
        for (int i = 0; i < foodName.length; i++) {
            for(int j = 0;j<foodName.length-1;j++){
                if (CustomerView.sumFood[j]< CustomerView.sumFood[j+1]) {
                    doutemp = CustomerView.sumFood[j];
                    CustomerView.sumFood[j] = CustomerView.sumFood[j+1];
                    CustomerView.sumFood[j+1]=doutemp;
                    temp = foodName[j];
                    foodName[j]=foodName[j+1];
                    foodName[j+1]=temp;
                    doutemp=foodPrice[j];
                    foodPrice[j]=foodPrice[j+1];
                    foodPrice[j+1]=doutemp;
                    doutemp= CustomerView.sumFoodBill[j];
                    CustomerView.sumFoodBill[j]= CustomerView.sumFoodBill[j+1];
                    CustomerView.sumFoodBill[j+1]=doutemp;
                }
            }
        }
        System.out.print("1.正序\n2.倒序");
        ch= Utility.choice$12().charAt(0);
        switch (ch){
            case '1':
                for (int i = 0; i < foodName.length; i++) {
                    System.out.println(foodName[i]+",销售总量"+ CustomerView.sumFood[i]+"份，总营收"+ CustomerView.sumFoodBill[i]);
                }
                break;
            case '2':
                for (int i = foodName.length-1; i >=0; i--) {
                    System.out.println(foodName[i]+",销售总量"+ CustomerView.sumFood[i]+"份，总营收"+ CustomerView.sumFoodBill[i]);
                }
                break;
        }
    }

    public void showBundledDetail(){
        System.out.println("=============赠送菜品情况=============");
        System.out.println("素三鲜水饺\t\t酸菜油吱啦水饺\t\t猪肉");
        for (int i = 0; i < 3; i++) {
            System.out.print(CustomerView.bundledFood[i]+"份\t\t");
        }
        System.out.println();
    }

    public void setForm() throws IOException {
        showNotYetForm();
        do {
            System.out.print("请输入订单编号：");
            String findKey = Utility.readString(3);
            if (!formService.setFormFinish(findKey)) {
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
