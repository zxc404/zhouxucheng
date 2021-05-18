package Demo07;

public class Poly {
    public static void main(String[] args) {

        Master peter = new Master("peter");
        Animal jery = new Dog("jery");
        Animal tom = new Cat("tom");
        Food bone = new Bone("bone");
        Food fish = new Fish("fish");
        peter.feed(jery,bone);
        peter.feed(tom,fish);
//        向下转型：
//        Dog dog =  (Dog)jery;
//        dog.play();
//        ((Dog) jery).play();
        jery.play();
        System.out.println(jery.id);
        System.out.println(jery instanceof Cat);
    }
}
