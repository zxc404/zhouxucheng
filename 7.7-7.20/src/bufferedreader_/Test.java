package bufferedreader_;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Zxc
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) throws IOException {

        String filePath = "E:\\repository\\java_learning\\7.7-7.20\\news01.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = bufferedReader.readLine())!=null){
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
