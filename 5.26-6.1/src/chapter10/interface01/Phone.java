package chapter10.interface01;

public class Phone implements UsbInterface{

    @Override
    public void start() {
        System.out.println("手机接入");
    }

    @Override
    public void end() {
        System.out.println("手机拔出");
    }
}
