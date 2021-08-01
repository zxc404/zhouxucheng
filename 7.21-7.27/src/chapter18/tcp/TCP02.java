package chapter18.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author Zxc
 * @version 1.0
 */
public class TCP02 {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket(InetAddress.getLocalHost(),9998);
        System.out.println(socket.getClass());
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("≤‚ ‘".getBytes());
        socket.shutdownOutput();
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int read = 0;
        while ((read = inputStream.read(bytes)) != -1){
            System.out.println(new String(bytes,0,read));
        }

        outputStream.close();
        inputStream.close();
        socket.close();
    }
}
