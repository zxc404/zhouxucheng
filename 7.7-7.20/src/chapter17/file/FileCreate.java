package chapter17.file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author Zxc
 * @version 1.0
 */
public class FileCreate {
    public static void main(String[] args) {

        String filePath = "E:\\repository\\java_learning\\7.7-7.20\\news01.txt";
        File file = new File(filePath);
        if (file.exists()){
            if (file.delete()){
                System.out.println("删除成功");
            }else {
                System.out.println("删除失败");
            }
        }else{
            System.out.println("文件不存在");
        }

    }

    @Test
    public void creat01() throws IOException {
        String filePath = "E:\\repository\\java_learning\\7.7-7.13\\news01.txt";
        File file = new File(filePath);
        file.createNewFile();
    }

    @Test
    public void creat02() throws IOException {
        File file = new File("E:\\repository\\java_learning\\7.7-7.13");
        String fileName = "news02.txt";
        File file1 = new File(file, fileName);
        file1.createNewFile();
    }

    @Test
    public void creat03() throws IOException {
        String parentPath="E:\\repository\\java_learning\\7.7-7.13";
        String fileName = "news03.txt";
        File file = new File(parentPath, fileName);
        file.createNewFile();
    }
}
