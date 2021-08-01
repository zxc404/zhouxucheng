package chapter17.outputstreamwriter;

import java.io.*;

/**
 * @author Zxc
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) throws IOException {

        String filePath = "E:\\repository\\java_learning\\7.21-7.27\\src\\chapter17\\outputstreamwriter\\test.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath),
                "gbk"));
        bufferedWriter.write("第一行");
        bufferedWriter.newLine();
        bufferedWriter.write("第二行");
        bufferedWriter.close();
    }
}
