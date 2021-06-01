package chapter11.homework01;

import org.omg.CORBA.Object;

/**
 * @author Zxc
 * @version 1.0
 */
public enum Color implements Out {
    RED(255,0,0),
    BLUE(0,0,255),
    BLACK(0,0,0),
    YELLOW(255,255,0),
    GREEN(0,255,0);

    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println(name()+"：\nredValue：" + redValue +
                            "\tgreenValue：" + greenValue +
                            "\tblueValue：" + blueValue);
    }

}
