package chapter10.interface01;

public class Test {

    public static void main(String[] args) {

        Computer computer = new Computer();
        Phone phone = new Phone();
        Camera camera = new Camera();
        computer.usb(camera);
        computer.usb(phone);
    }
}
