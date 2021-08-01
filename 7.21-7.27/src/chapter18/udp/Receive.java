package chapter18.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author Zxc
 * @version 1.0
 */
public class Receive {
    public static void main(String[] args) throws IOException {

        DatagramSocket datagramSocket = new DatagramSocket(9999);
        byte[] bytes = new byte[1024*64];
        DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length);

        System.out.println("接收端等待接收数据···");
        datagramSocket.receive(datagramPacket);

        String s = new String(datagramPacket.getData(),0,datagramPacket.getLength());
        System.out.println(s);

        byte[] bytes1 = "已收到".getBytes();
        DatagramPacket datagramPacket1 = new DatagramPacket(bytes1, bytes1.length, InetAddress.getByName("明君"), 9998);
        datagramSocket.send(datagramPacket1);

        datagramSocket.close();
    }
}
