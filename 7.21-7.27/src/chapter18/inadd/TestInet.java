package chapter18.inadd;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author Zxc
 * @version 1.0
 */
public class TestInet {
    public static void main(String[] args) throws UnknownHostException {

//        ��ȡ������IP��ַ
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);

        InetAddress name = InetAddress.getByName("����");
        System.out.println(name);

        InetAddress byName = InetAddress.getByName("www.baidu.com");
        System.out.println(byName);

        System.out.println(byName.getHostAddress());
        System.out.println(byName.getHostName());
    }
}
