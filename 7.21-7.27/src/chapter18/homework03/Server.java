package chapter18.homework03;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;

/**
 * @author Zxc
 * @version 1.0
 */
public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = 0;
        String file="";
        while ((len = inputStream.read(bytes))!= -1){
            file = new String(bytes,0,len);
        }
        System.out.println("ÎÄ¼þÃû£º"+file);
        String filePath;
        if ("Í¼Æ¬.jpg".equals(file)){
             filePath = "E:\\repository\\java_learning\\7.21-7.27\\src\\chapter18\\homework03\\" + file;
        }else{
            filePath = "E:\\repository\\java_learning\\7.21-7.27\\src\\chapter18\\homework03\\yesy.txt";
        }
        BufferedInputStream bufferedInputStream =
                new BufferedInputStream(new FileInputStream(filePath));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bytes1 = new byte[1024];
        int len1;
        while ((len1 = bufferedInputStream.read(bytes1)) != -1){
            byteArrayOutputStream.write(bytes,0,len1);
        }
        byte[] array = byteArrayOutputStream.toByteArray();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        bufferedOutputStream.write(array);
        socket.shutdownOutput();
        bufferedInputStream.close();
        bufferedOutputStream.close();
        socket.close();
        serverSocket.close();
    }
}
