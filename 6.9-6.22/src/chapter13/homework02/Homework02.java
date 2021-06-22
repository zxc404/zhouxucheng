package chapter13.homework02;

/**
 * @author Zxc
 * @version 1.0
 */
public class Homework02 {

    public static void main(String[] args) {

        String name = "jack";
        String pwd = "123443";
        String email = "adshu@hd.com";

        try {
            userRegister(name,pwd,email);
            System.out.println("注册成功");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void userRegister(String name,String pwd,String email){
        int userLength = name.length();
        if(!(userLength>=2&&userLength<=4)){
            throw new RuntimeException("用户名长度不符");
        }

        if(!(pwd.length()==6&&isDigital(pwd))){
            throw new RuntimeException("密码不符合格式");
        }

        int i=email.indexOf('@');
        int j=email.indexOf('.');
        if(!(i>0 && j>i)){
            throw new RuntimeException("邮箱格式错误");
        }
    }

    public static boolean isDigital(String str){
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]<'0'||ch[i]>'9'){
                return false;
            }
        }
        return true;
    }

}
