package chapter18.homework02;

import java.io.IOException;
import java.net.*;

/**
 * @author Zxc
 * @version 1.0
 */
public class Sender {
    public static void main(String[] args) throws IOException {

        DatagramSocket datagramSocket = new DatagramSocket(9998);
        byte[] bytes = "ËÄ´óÖø".getBytes();
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("Ã÷¾ý"), 9999);
        datagramSocket.send(datagramPacket);

        byte[] bytes1 = new byte[1024*64];
        DatagramPacket datagramPacket1 = new DatagramPacket(bytes1, bytes1.length);
        datagramSocket.receive(datagramPacket1);
        String str = new String(datagramPacket1.getData());
        System.out.println(str);
        datagramSocket.close();

    }
}
