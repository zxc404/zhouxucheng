package service;

import domain.form.Form;
import utils.DateUtility;

import java.util.HashMap;
import java.util.Set;

/**
 * @author Zxc
 * @version 1.0
 */
public class FormService {

    private static double[] sumFood=new double[3];
    private static int sumForm=0;
    private static HashMap formMap = new HashMap();
    private static int key;

    public String creatForm(String foodList, String buildOrderTime,
                            double sumMoney, String discountMessage,
                            double finalMoney, String vipID){
//        formService.creatForm(
//        formService.creatFoodList(food), DateUntility.getDateymdhms(),
//        preBill,whatDiscount,finalBill,ID==null?"无会员":ID);
        Form form = Form.getForm(foodList, buildOrderTime, false, null, sumMoney, discountMessage, finalMoney, vipID);
        formMap.put(form.getID(),form);
        return form.getID()+"\t\t"+form.toString();
    }

    public String creatFoodList(double[] food){
        String[] strings = new String[3];
        strings[0]="素三鲜水饺,";
        strings[1]="酸菜油吱啦水饺,";
        strings[2]="猪肉,";
        String foodList = "";
        for (int i = 0; i < 3; i++) {
            if(food[i]!=0){
                foodList += strings[i]+food[i]+"斤 ";
                sumFood[i]+=food[i];
            }
        }
        if (foodList != null) {
            sumForm++;
            return foodList;
        }
        return "菜单为空";
    }

    public boolean findForm(String key){
        String formMessage=null;
        if (formMap.get(key).toString()!=null) {
            Form form = (Form)formMap.get(key);
            System.out.println("==================订单信息==================");
            System.out.println("订单编号\t\t排队序号\t\t菜品详情\t\t订单生成时间\t\t订单状态\t\t订单完成时间\t\t订单总金额\t\t折扣信息\t\t实付款\t\t会员编号");
            System.out.println(form.getID()+"\t\t"+form.toString());
            return true;
        }
        return false;
    }

    public void showNotYet(){
        Set set = formMap.keySet();
        for (Object o :set) {
            Form form = (Form)formMap.get(o);
            if (!form.isFormIsFinish()) {
                System.out.println(o+"\t\t"+form.toString());
            }
        }
    }

    public boolean setFormFinish(String key){
        if (formMap.get(key).toString()!=null) {
            Form form = (Form)formMap.get(key);
            System.out.println("================修改前订单信息================");
            System.out.println("订单编号\t\t排队序号\t\t菜品详情\t\t订单生成时间\t\t订单状态\t\t订单完成时间\t\t订单总金额" +
                    "\t\t折扣信息\t\t实付款\t\t会员编号");
            System.out.println(form.getID()+"\t\t"+form.toString());
            form.setFormIsFinish(true);
            form.setOrderFinishTime(DateUtility.getDateymdhms());
            System.out.println("================修改后订单信息================");
            System.out.println("订单编号\t\t排队序号\t\t菜品详情\t\t订单生成时间\t\t订单状态\t\t订单完成时间\t\t订单总金额" +
                    "\t\t折扣信息\t\t实付款\t\t会员编号");
            System.out.println(form.getID()+"\t\t"+form.toString());
            formMap.put(key,form);
            return true;
        }
        return false;
    }
}
