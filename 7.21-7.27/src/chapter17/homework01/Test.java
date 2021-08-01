package chapter17.homework01;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Zxc
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) throws IOException {
        String filePath = "E:\\repository\\java_learning\\7.21-7.27\\src\\chapter17\\homework01\\mytemp";
        File file = new File(filePath);
        if (!file.exists()){
            if (file.mkdir()){
                System.out.println("创建成功");
            }else{
                System.out.println("创建失败");
            }
        }
        String path = filePath+"\\hello.txt";
        File file1 = new File(path);
        if (!file1.exists()){
            if (file1.createNewFile()){
                System.out.println("创建成功");
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file1));
                bufferedWriter.write("hello,world");
                bufferedWriter.close();
            }else{
                System.out.println("创建失败");
            }
        }
    }
}
