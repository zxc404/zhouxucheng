package chapter18.homework03;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author Zxc
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) throws IOException {

        String str = "图片.jpg";
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        bufferedOutputStream.write(str.getBytes());
        bufferedOutputStream.flush();
        socket.shutdownOutput();

        byte[] bytes = new byte[1024];
        BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bytes1 = new byte[1024];
        int len1;
        while ((len1 = bufferedInputStream.read(bytes1)) != -1){
            byteArrayOutputStream.write(bytes,0,len1);
        }
        byte[] array = byteArrayOutputStream.toByteArray();

        BufferedOutputStream bufferedOutputStream1 = new BufferedOutputStream(new FileOutputStream
                ("E:\\repository\\java_learning\\7.21-7.27\\src\\chapter18\\homework03\\" + str));
        bufferedOutputStream1.write(array);

        bufferedInputStream.close();
        bufferedOutputStream.close();
        bufferedOutputStream1.close();
        socket.close();
        byteArrayOutputStream.close();
    }
}
