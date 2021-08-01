package chapter18.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Zxc
 * @version 1.0
 */
public class AcJPG {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(9997);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bytes = new byte[1024];
        int len;
        while ((len = inputStream.read(bytes)) != -1){
            byteArrayOutputStream.write(bytes,0,len);
        }
        byte[] array = byteArrayOutputStream.toByteArray();

        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("E:\\repository\\" +
                "java_learning\\7.21-7.27\\src\\chapter18\\tcp\\图片02.jpg"));
        bufferedOutputStream.write(array);
        bufferedOutputStream.close();
        inputStream.close();
        socket.close();
    }
}
