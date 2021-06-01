package chapter10.homework06;

/**
 * @author Zxc
 * @version 1.0
 */
public class Car {

    private double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }

    class Air{
        public void flow(){
            if(temperature<0){
                System.out.println("给我一点点温暖~");
            }else if(temperature>40){
                System.out.println("为你我受冷风吹~");
            }else{
                System.out.println("四季如春");
            }
        }
    }
}
