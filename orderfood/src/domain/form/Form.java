package domain.form;

/**
 * @author Zxc
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Form {

    private static int preID=111;
    private String ID;
    private String foodList;
    private String buildOrderTime;
    private boolean formIsFinish;
    private String orderFinishTime;
    private double sumMoney;
    private String discountMessage;
    private double finalMoney;
    private String vipID;
    private Form form;

    public Form(String foodList,
                String buildOrderTime, boolean formIsFinish,
                String orderFinishTime, double sumMoney,
                String discountMessage, double finalMoney,
                String vipID) {
        this.ID = preID+"";
        preID++;
        this.foodList = foodList;
        this.buildOrderTime = buildOrderTime;
        this.formIsFinish = formIsFinish;
        this.orderFinishTime = orderFinishTime;
        this.sumMoney = sumMoney;
        this.discountMessage = discountMessage;
        this.finalMoney = finalMoney;
        this.vipID = vipID;
    }

//    foodList,buildOrderTime,false,null,sumMoney,discountMessage,finalMoney,vipID
    public static Form getForm(String foodList,
                               String buildOrderTime, boolean formIsFinish,
                               String orderFinishTime, double sumMoney,
                               String discountMessage, double finalMoney,
                               String vipID) {
        return new Form(foodList,buildOrderTime,formIsFinish,
                orderFinishTime,sumMoney,discountMessage,finalMoney,vipID);
    }

    @Override
    public String toString() {
        String isFinish = formIsFinish?"已完成":"待完成";
        orderFinishTime = formIsFinish?orderFinishTime:"未完成";
        return ID + "\t\t" + foodList +
                "\t\t" + buildOrderTime +
                "\t\t" + isFinish +
                "\t\t" + orderFinishTime +
                "\t\t" + sumMoney +
                "\t\t" + discountMessage +
                "\t\t" + finalMoney +
                "\t\t" + vipID;
    }

    public String getID() {
        return ID;
    }

    public boolean isFormIsFinish() {
        return formIsFinish;
    }

    public void setFormIsFinish(boolean formIsFinish) {
        this.formIsFinish = formIsFinish;
    }

    public void setOrderFinishTime(String orderFinishTime) {
        this.orderFinishTime = orderFinishTime;
    }
}
