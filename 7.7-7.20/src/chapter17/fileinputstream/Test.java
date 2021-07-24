package chapter17.fileinputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Zxc
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        String filePath = "E:\\repository\\java_learning\\7.7-7.20\\news03.txt";
        int readData;
        byte[] buf = new byte[8];
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);
            while ((readData=fileInputStream.read())!=-1){
                System.out.print((char)readData);
            }
            System.out.println();
//            int readDa=0;
//            while ((readDa=fileInputStream.read(buf))!=-1){
//                System.out.print(new String(buf,0,readDa));
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
