package chapter10.CodeBlock;

public class Test {

    public static void main(String[] args) {

        new BBB();
//        父类AAA的静态初始化方法，st=100.
//        父类AAA的静态代码块 100
//        子类BBB的静态代码块
//        子类BBB的静态初始化方法，st1=900.
//        父类AAA的静态初始化方法，st=100.
//        父类AAA的普通初始化方法，nst=200.
//        父类AAA的普通代码块 100
//        父类AAA的构造器
//        子类BBB的普通代码块 900
//        子类BBB的构造器
    }
}

class AAA{

    private static int st = getSt();
    private int nst = getSt();
    private int nst1 = getNst();
    static {
        System.out.println("父类AAA的静态代码块 " + st);
    }

    {
        System.out.println("父类AAA的普通代码块 " + st);
    }

    public static int getSt(){
        System.out.println("父类AAA的静态初始化方法，st=100.");
        return 100;
    }

    public int getNst(){
        System.out.println("父类AAA的普通初始化方法，nst=200.");
        return 200;
    }

    public AAA() {
        System.out.println("父类AAA的构造器");
    }
}

class BBB extends AAA{

    static {
        System.out.println("子类BBB的静态代码块 ");
    }

    {
        System.out.println("子类BBB的普通代码块 " + st1);
    }
    private static int st1 = getSt1();
    public static int getSt1(){
        System.out.println("子类BBB的静态初始化方法，st1=900.");
        return 900;
    }
    public BBB() {
        System.out.println("子类BBB的构造器");
    }
}
