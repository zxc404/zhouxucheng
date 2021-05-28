package chapter09.houserent.view;

import chapter09.houserent.domain.House;
import chapter09.houserent.service.Service;
import chapter09.houserent.utils.Utility;

import java.io.IOException;

public class HouseView {

    private boolean loop =true;
    private char key=' ';
    private static Service service = new Service(3);


        /**
         * 功能：显示主菜单，接收用户的接收并调用相应的方法
         */
    public void mainMenu() throws IOException {
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
                    case '1':   create();
                        break;
                    case '2':   find();
                        break;
                    case '3':   delete();
                        break;
                    case '4':   update();
                        break;
                    case '5':   listHouse();
                        break;
                    case '6':   signOut();
                        break;
                }
           }while(loop);
    }

    /**
     * 功能：输出现有房屋数组的信息
     */
    public void listHouse(){
        System.out.println("===============房屋列表===============");
        System.out.println("编号\t 房主\t电话" +
                "\t地址\t月租\t状态(未出租/已出租)");
        House[] houses = service.list();
        for (int i = 0; i < houses.length; i++) {
            if(houses[i]==null) continue;
            System.out.println(houses[i]);
        }
        System.out.println("=============房屋列表显示完毕=============");
    }

    /**
     * 功能：根据提示输入房屋属性，创建新的house对象并加入houses数组中，
     *      对添加的房屋进行自动编号，如果数组已满，将提示输入失败。
     * @throws IOException
     */
    public void create() throws IOException {
        System.out.println("===============添加房屋===============");
        System.out.print("姓名：");
        String name = Utility.readString(8,"匿名");
        System.out.print("电话：");
        String phone = Utility.readString(3);
        System.out.print("地址：");
        String address = Utility.readString(16);
        System.out.print("月租：");
        int rent = Utility.readInt();
        System.out.print("状态：");
        String state = Utility.readString(3,"未出租");
        House newHouse = new House(service.getNums()+1, name, phone, address, rent, state);
        if(service.add(newHouse)){
            System.out.println("==============添加房屋成功==============");
        }else {
            System.out.println("==============添加房屋失败==============");
        }
    }

    /**
     * 功能：删除指定输入的id的房屋信息，输入-1退出，输入错误提示重新输入。
     * @throws IOException
     */
    public void delete() throws IOException {
        boolean loop = true;
        do{
            System.out.print("请输入删除房屋的id号(-1退出)：");
            int deleteId = Utility.readInt();
            if(deleteId == -1) { break; }
            System.out.println("确定删除id为"+deleteId+"的房屋信息吗?");
            String choice = Utility.readConfirmSelection();
            if(choice.equalsIgnoreCase("N")){ break; }
            if(service.deleteHouse(deleteId)){
                System.out.println("==============删除房屋成功==============");
                return;
            }else{
                System.out.println("房屋id不存在，请重新输入。");
            }
        }while (loop);
        System.out.println("==============放弃删除房屋==============");
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

    /**
     * 功能：按照指定id查找房屋信息并输出，id不存在给出提示。
     * @throws IOException
     */
    public void find() throws IOException {
        System.out.print("请输入查找房屋id：");
        for(;;) {
            int findId = Utility.readInt();
            if (service.findHouse(findId)) {
                System.out.println("===============查找完成===============");
                return;
            } else {
                System.out.println("===============查找失败===============");
                System.out.print("是否继续查找，");
                if(Utility.readConfirmSelection().equalsIgnoreCase("n")){
                    return;
                }
                System.out.print("请重新输入查找房屋id：");
            }
        }
    }

    /**
     * 功能：根据id查找房屋对象并提示相应的信息用以修改。
     * @throws IOException
     */
    public void update() throws IOException {
        System.out.print("请输入修改房屋id：");
        for(;;) {
            int findId = Utility.readInt();
            if (service.updateHouse(findId)) {
                System.out.println("===============修改完成===============");
                return;
            } else {
                System.out.println("===============修改失败===============");
                System.out.print("是否继续修改，");
                if(Utility.readConfirmSelection().equalsIgnoreCase("n")){
                    return;
                }
                System.out.print("请重新输入修改房屋id：");
            }
        }
    }
}
