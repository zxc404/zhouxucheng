package chapter18.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Zxc
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务器端等待连接···");
//        当没有客户端连接9999端口时，程序继续，否则阻塞，等待连接

        Socket accept = serverSocket.accept();
        System.out.println("服务器端socket"+accept.getClass());

        InputStream inputStream = accept.getInputStream();
        byte[] bytes = new byte[1024];
        int readlen = 0;
        while ((readlen=inputStream.read(bytes))!=-1){
            System.out.println(new String(bytes,0,readlen));
        }
        inputStream.close();
        accept.close();
        serverSocket.close();
    }
}
