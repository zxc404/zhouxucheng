package chapter12.trycatch01;

/**
 * @author Zxc
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {

        try {
            try {
            System.out.println(3/0);
        } catch (Exception e) {
            System.out.println("子类异常");
        }
            String name = "awsl";
            System.out.println(Integer.parseInt(name));
            System.out.println("异常后的代码");
        } catch (Exception e) {
            System.out.println("异常被捕获");
            e.printStackTrace();
        }finally {
            System.out.println("释放资源");
        }
        System.out.println("后续代码继续执行");
    }
}
