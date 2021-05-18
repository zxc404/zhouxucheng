package Demo07;

public class Dog extends Animal{
    String id = "dog";
    public Dog(String name) {
        super(name);
    }
    public void play(){
        System.out.println("Dog play toy...");
    }
}
