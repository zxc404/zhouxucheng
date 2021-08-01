package chapter18.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Zxc
 * @version 1.0
 */
public class Test02 {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(9998);
        System.out.println("端口9998等待接收···");

        Socket socket = serverSocket.accept();
        System.out.println(socket.getClass());

        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int read = 0;
        while ((read = inputStream.read(bytes))!=-1){
            System.out.println(new String(bytes,0,read));
        }
        socket.shutdownInput();
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("收到".getBytes());
        inputStream.close();
        outputStream.close();
        socket.close();
        serverSocket.close();
    }
}
