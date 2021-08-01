package chapter18.homework01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author Zxc
 * @version 1.0
 */
public class Sender {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket(InetAddress.getLocalHost(),9999);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        bufferedOutputStream.write("bil".getBytes());
        bufferedOutputStream.flush();
        socket.shutdownOutput();

        BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = new byte[1024];
        int read;
        while ((read = bufferedInputStream.read(bytes)) != -1){
            System.out.println(new String(bytes,0,read));
        }
        socket.shutdownInput();

        bufferedInputStream.close();
        bufferedOutputStream.close();
        socket.close();
    }
}
