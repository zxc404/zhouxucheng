package chapter12.customexcaption;

/**
 * @author Zxc
 * @version 1.0
 */
public class CustomException {

    public static void main(String[] args) {

        int age = 180;
        if(!(age>=18 && age<=120)){
            throw new AgeException("年龄需要在18-120之间");
        }
    }
}

class AgeException extends RuntimeException{
    public AgeException(String message) {
        super(message);
    }
}