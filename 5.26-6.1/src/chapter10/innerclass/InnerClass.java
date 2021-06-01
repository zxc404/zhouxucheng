package chapter10.innerclass;

public class InnerClass {

    public static void main(String[] args) {

        f1(new AA() {
            @Override
            public void show() {
                System.out.println("匿名内部类AA");
            }
        });
        f1(
            f2(new Person() {
                @Override
                public AA print_() {
                     return new AA() {
                        @Override
                        public void show() {
                            System.out.println("匿名内部类AAA");
                        }
                    };
                 }
            })
        );
    }

    public static void f1(AA aa){
            aa.show();
    }
    public static AA f2(Person person){
       return person.print_();
    }
}

 abstract class Person{
    public abstract AA print_();
}

interface AA{
    void show();
};