package chapter09.houserent.service;

import chapter09.houserent.domain.House;
import chapter09.houserent.utils.Utility;

import java.awt.event.ItemEvent;
import java.io.IOException;

public class Service {

    private House[] houses;
    private int nums = 0;

    public Service(int size){

        houses = new House[size];
//        houses[0] = new House(1,"jack",
//                "110","海淀区",3000,
//                "未出租");
    }

    /**
     * 功能：返回构造器生成的houses数组
     * @return  构造器生成的houses数组
     */
    public House[] list(){
        return houses;
    }

    /**
     * 功能：计算houses数组内非空元素的个数赋给nums，当遇到null或者数组最后一项时结束
     *      当最后一项为null时--num，保证最后一项的填补。
     */
    public void getHousesNum(){
        nums = 0;
        House house;
        do{
            house = houses[nums++];
        }while(house!=null && nums<houses.length);
        if(house == null){ --nums;}
    }

    /**
     * 功能：调用getHouseNum方法计算当前houses数组非空元素个数并返回。
     * @return  当前houses数组元素个数
     */
    public int getNums() {
        getHousesNum();
        return nums;
    }

    /**
     * 功能：向数组中添加house元素，期间调用getHouseNum方法判断是否能够添加。
     * @param newHouse  需要添加的新house元素
     * @return  是否添加成功
     */
    public boolean add(House newHouse){
        getHousesNum();
        if(nums == houses.length){
            System.out.println("数组已满，不可添加~");
            return false;
        }
        houses[nums] = newHouse;
        nums++;
        return true;
    }

    /**
     * 功能：将指定id的房屋信息删除，让后续元素前移一格并更新id号。
     * @param id    指定房屋的id
     * @return  是否删除成功的boolean值
     */
    public boolean deleteHouse(int id){
        if(id>nums||id<0){
            return false;
        }
        for(int i = id - 1;i<houses.length-1;i++){
            houses[i]=houses[i+1];
            if(houses[i+1]!=null){//不加此if语句会导致下一元素可能没有getId方法
                houses[i].setId(houses[i].getId()-1);
            }
            houses[i+1]=null;
        }
        nums--;
        return true;
    }

    /**
     * 功能：根据id查找房屋对象，输出信息并返回true，若id越界，返回false。
     * @param id    待查找房屋id
     * @return  是否查找成功
     */
    public boolean findHouse(int id){
        if(id>nums||id<0){
            return false;
        }
        System.out.println("===============房屋信息===============");
        System.out.println("编号\t 房主\t电话" +
                "\t地址\t月租\t状态(未出租/已出租)");
        System.out.println(houses[id-1]);
        return true;
    }

    /**
     * 功能：根据id查找house对象，id输入错误给出提示，返回false，
     *      根据提示修改该对象的信息，修改成功返回true。
     * @param id    修改房屋的id
     * @return  是否修改成功
     * @throws IOException
     */
    public boolean updateHouse(int id) throws IOException {
        if(id>nums||id<0){
            return false;
        }
        System.out.println("==============修改房屋信息==============");
        System.out.print("姓名("+houses[id-1].getName()+")：");
        houses[id-1].setName(Utility.readString(8,"匿名"));
        System.out.print("电话("+houses[id-1].getPhone()+")：");
        houses[id-1].setPhone(Utility.readString(3));
        System.out.print("地址("+houses[id-1].getAddress()+")：");
        houses[id-1].setAddress(Utility.readString(16));
        System.out.print("月租("+houses[id-1].getRent()+")：");
        houses[id-1].setRent(Utility.readInt());
        System.out.print("状态("+houses[id-1].getState()+")：");
        houses[id-1].setState(Utility.readString(3,"未出租"));
        return true;
    }
}
