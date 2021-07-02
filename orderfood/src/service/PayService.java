package service;

import domain.card.Card;
import utils.Utility;
import view.CustomerView;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Zxc
 * @version 1.0
 */
public class PayService {

    Map map = new HashMap();
    Card card;

    public boolean pay(double bill){
        System.out.println("支付中~~");
        return true;
    }

    public boolean cardPay(String string,double bill) throws IOException {
        System.out.println(map.get(string));
        card = (Card) (map.get(string));
        CustomerView.whatDiscount = card.getDiscount()==10?null:card.getDiscount()+"";
        System.out.println("账单：共计"+bill+"元");
        System.out.println("实付金额："+bill*card.getDiscount()*0.1+"元");
        System.out.print("确认支付(Y/N)：");
        if(Utility.confirmSelection().equalsIgnoreCase("Y")&&card.getBalance()-bill*card.getDiscount()*0.1>=0){
            System.out.print("支付中~~");
            CustomerView.finalBill=bill*card.getDiscount()*0.1;
            card.setBalance(card.getBalance()-bill*card.getDiscount()*0.1);
            System.out.println(card);
            return true;
        }
        return false;
    }

    public boolean creatCard() throws IOException {
        System.out.print("姓名：");
        String name = Utility.readString(8);
        System.out.print("电话：");
        String phone = Utility.readString(11);
        System.out.println("充值500-799  普通卡，用餐立享9折");
        System.out.println("充值800-999 白银卡，用餐立享8折");
        System.out.println("充值1000以上 黄金卡，用餐立享7折");
        System.out.print("充值金额：");
        double balance = Utility.readDouble();
        if (pay(balance)) {
            System.out.println("支付成功！");
        }else return false;
        String id = Card.getNum()+"";
        map.put(id, Card.getCard(name,phone,balance));
        System.out.println(map.get(id));
        return true;
    }
}
