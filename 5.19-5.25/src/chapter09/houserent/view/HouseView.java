package chapter09.houserent.view;

import chapter09.houserent.domain.House;
import chapter09.houserent.service.Service;
import chapter09.houserent.utils.Utility;

public class HouseView {

    private boolean loop =true;
    private char key=' ';
    private Service service = new Service(3);


    public void listHouse(){
        System.out.println("===============房屋列表===============");
        System.out.println("编号\t\t 房主\t\t 电话" +
                "\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        House[] houses = service.list();
        for (int i = 0; i < houses.length; i++) {
            if(houses[i]==null)continue;
            System.out.println(houses[i]);
        }
        System.out.println("=============房屋列表显示完毕=============");
    }

    public void mainMenu(){
           do{
               System.out.println("=============房屋出租系统菜单=============");
               System.out.println("\t\t\t1 新 增 房 源");
               System.out.println("\t\t\t2 查 找 房 屋");
               System.out.println("\t\t\t3 删除房屋信息");
               System.out.println("\t\t\t4 修改房屋信息");
               System.out.println("\t\t\t5 房 屋 列 表");
               System.out.println("\t\t\t6 退       出");
               System.out.print("请输入你的选择(1-6)：");
                key = Utility.readChar();
                switch (key){
                    case '1':
                        System.out.println("新增房源");
                        break;
                    case '2':
                        System.out.println("查找房屋");
                        break;
                    case '3':
                        System.out.println("删除房屋信息");
                        break;
                    case '4':
                        System.out.println("修改房屋信息");
                        break;
                    case '5':
                        listHouse();
                        break;
                    case '6':
                        System.out.println("退  出");
                        loop = false;
                        break;
                }
           }while(loop);
    }
}
