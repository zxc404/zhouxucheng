package chapter18.tcp;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author Zxc
 * @version 1.0
 */
public class UpJPG {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket(InetAddress.getLocalHost(), 9997);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("E:\\repository\\" +
                "java_learning\\7.21-7.27\\src\\chapter18\\tcp\\图片.jpg"));

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bufferedInputStream.read(bytes)) != -1){
            byteArrayOutputStream.write(bytes,0,len);
        }
        byte[] array = byteArrayOutputStream.toByteArray();

        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        bufferedOutputStream.close();
        socket.shutdownOutput();
        byteArrayOutputStream.close();
    }
}
