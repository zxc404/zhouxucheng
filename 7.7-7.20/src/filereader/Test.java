package filereader;

import java.io.*;

/**
 * @author Zxc
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        FileReader fileReader = null;
        String file="E:\\repository\\java_learning\\7.7-7.20\\news02.txt";
        int read = 0;
        try {
            fileReader = new FileReader(file);
            while ((read=fileReader.read())!=-1){
                System.out.print((char)read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
