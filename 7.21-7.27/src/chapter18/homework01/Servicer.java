package chapter18.homework01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Zxc
 * @version 1.0
 */
public class Servicer {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("正在等待接收···");
        Socket socket = serverSocket.accept();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = new byte[1024];
        int read;
        String str = null;
        while((read = bufferedInputStream.read(bytes)) != -1){
            str = new String(bytes,0,read);
        }
        socket.shutdownInput();

        String answer;
        if ("nova".equals(str)){
            answer =  "收到nova";
        }else if("bily".equals(str)){
            answer = "收到bily";
        }else{
            answer = "你说啥";
        }
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        bufferedOutputStream.write(answer.getBytes());
        bufferedOutputStream.flush();
        socket.shutdownOutput();
        bufferedInputStream.close();
        bufferedOutputStream.close();
        socket.close();
        serverSocket.close();
    }
}
