package chapter10.SingleTon02;

public class Test {

    public static void main(String[] args) {

        System.out.println(Cat.getCat());
    }
}

/**
 * 懒汉式单例模式：将创建对象放入静态方法中，
 * 只有当静态方法被调用时才会在堆中创建一个实例对象
 */
class Cat{

    private String name;
    private static Cat cat;

    private Cat(String name) {
        this.name = name;
    }

    public static Cat getCat(){
        if(cat == null){
            cat = new Cat("点点");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
