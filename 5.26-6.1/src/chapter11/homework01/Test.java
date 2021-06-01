package chapter11.homework01;

/**
 * @author Zxc
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {

        for(Color color : Color.values()){
            color.show();
            switch (color){
                case BLACK:
                    System.out.println("找到黑色了");
            }
        }
    }
}
