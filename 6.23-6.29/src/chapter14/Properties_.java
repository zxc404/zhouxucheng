package chapter14;

import java.util.Properties;

/**
 * @author Zxc
 * @version 1.0
 */
public class Properties_ {

    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        Properties properties = new Properties();
//        properties.put(null,"sda");
        properties.put(11,"wq");
        properties.put(12,"sw");
        properties.put(12,"asd");
        properties.remove(12);
    }
}
