package chapter18.homework02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author Zxc
 * @version 1.0
 */
public class Receiver {
    public static void main(String[] args) throws IOException {

        DatagramSocket datagramSocket = new DatagramSocket(9999);
        byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
        datagramSocket.receive(datagramPacket);
        String question = new String(datagramPacket.getData(),0,datagramPacket.getLength());
        String answer = null;
        System.out.println(question);
        if (question.equals("四大名著")){
            answer = "《红楼梦》《三国演义》《水浒传》《水浒传》";
        }else{
            answer = "不晓得";
        }
        DatagramPacket datagramPacket1 = new DatagramPacket(answer.getBytes(), answer.length(), InetAddress.getByName("明君"), 9998);
        datagramSocket.send(datagramPacket1);

        datagramSocket.close();
    }
}
