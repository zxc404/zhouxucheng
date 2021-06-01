package chapter10.interface01;

public class Computer {

    public void usb(UsbInterface usbInterface){
        usbInterface.start();
        usbInterface.end();
    }
}
