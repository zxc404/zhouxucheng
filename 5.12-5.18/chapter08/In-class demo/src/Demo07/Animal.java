package Demo07;

public class Animal {

    private String name;
    String id = "animal";

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void play(){
        System.out.println("play toy...");
    }
}
