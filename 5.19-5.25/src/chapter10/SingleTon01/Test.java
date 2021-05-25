package chapter10.SingleTon01;

public class Test {

    public static void main(String[] args) {

        System.out.println(Pet.getCat());
    }
}

/**
 * 饿汉式单例模式：将构造器私有化，再提供一个自身的静态实例，
 * 提供一个静态方法返回该实例，在类被加载时，该实例已经被创建
 */
class Pet{

    private String name;

//    由于需要一个静态方法返回对象实例，因此类中的对象要用static修饰
    private static Pet cat = new Pet("点点");

    private Pet(String name) {
        this.name = name;
    }

    public static Pet getCat(){
        return cat;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                '}';
    }
}
