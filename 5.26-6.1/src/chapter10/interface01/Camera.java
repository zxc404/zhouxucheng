package chapter10.interface01;

public class Camera implements UsbInterface {
    @Override
    public void start() {
        System.out.println("相机接入");
    }

    @Override
    public void end() {
        System.out.println("相机拔出");
    }
}
