import utils.Utility;
import view.CustomerView;
import view.ShopkeeperView;

import java.io.IOException;

/**
 * @author Zxc
 * @version 1.0
 */
public class FoodAPP {

    public static void main(String[] args) throws IOException {

        char key=' ';
        boolean loop=true;
        CustomerView customerView;
        do {
            System.out.println("===============孙二娘餐馆===============");
            System.out.println("\t\t\t1. 顾客登录");
            System.out.println("\t\t\t2. 店员登录");
            System.out.print("选择登录，退出输入0：");
            switch (key= Utility.choice$012().charAt(0)){
                case'0':
                    return;
                case '1':
                    customerView = new CustomerView();
                    customerView.mainMenu();
                    break;
                case '2':
                    do {
                        System.out.print("请输入密码：");
                        if(Utility.readString(10).equals("888888")){
                        new ShopkeeperView().shopkeeperMenu();
                        loop=false;
                        }else {
                            System.out.println("密码错误，请重新输入！");
                        }
                    } while (loop);
                    break;
                default:
                    break;
            }
        } while (true);
    }
}
