package bufferedwriter_;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Zxc
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) throws IOException {
        String filePath = "E:\\repository\\java_learning\\7.7-7.20\\news01.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath,true));
        bufferedWriter.newLine();
        bufferedWriter.write("插入一行");
        bufferedWriter.close();
    }
}
