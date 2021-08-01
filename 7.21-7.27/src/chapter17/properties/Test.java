package chapter17.properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Zxc
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();
        properties.load(new FileReader("E:\\repository\\java_learning\\7.21-7.27\\" +
                "src\\chapter17\\properties\\test.properties"));

        properties.list(System.out);
        String name = properties.getProperty("name");
        System.out.println(name);
        Properties properties1 = new Properties();
        properties1.setProperty("use","µÄ");
        properties1.setProperty("user","zxc");
        properties1.setProperty("users","zxcs");
        properties1.store(new FileOutputStream("E:\\repository\\java_learning\\7.21-7.27\\" +
                "src\\chapter17\\properties\\test1.properties"),"no tip");
    }
}
