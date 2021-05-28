package chapter09.houserent;

import chapter09.houserent.view.HouseView;

import java.io.IOException;

public class HouseRentAPP {

    public static void main(String[] args) throws IOException {
//        是整个程序的入口
        new HouseView().mainMenu();
        System.out.println("你已退出房屋出租系统~~");
    }
}
