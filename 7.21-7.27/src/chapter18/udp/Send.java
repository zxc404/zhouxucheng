package chapter18.udp;

import java.io.IOException;
import java.net.*;

/**
 * @author Zxc
 * @version 1.0
 */
public class Send {
    public static void main(String[] args) throws IOException {

        DatagramSocket datagramSocket = new DatagramSocket(9998);
        DatagramPacket datagramPacket = new DatagramPacket("hello".getBytes(), 5, InetAddress.getByName("Ã÷¾ý"), 9999);
        datagramSocket.send(datagramPacket);

        byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket1 = new DatagramPacket(bytes, bytes.length);
        datagramSocket.receive(datagramPacket1);
        String str = new String(datagramPacket1.getData(),0,datagramPacket1.getLength());
        System.out.println(str);

        datagramSocket.close();

    }
}
