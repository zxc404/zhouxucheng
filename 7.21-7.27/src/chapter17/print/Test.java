package chapter17.print;

import java.io.IOException;
import java.io.PrintStream;

/**
 * @author Zxc
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) throws IOException {

        PrintStream out = System.out;
        out.write("输出".getBytes());
        System.setOut(new PrintStream("E:\\repository\\java_learning" +
                "\\7.21-7.27\\src\\chapter17\\print\\test.txt"));
        System.out.println("输出");
        System.out.println();
        System.out.println("下一行");
    }
}
