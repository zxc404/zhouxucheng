package Demo07;

public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void feed(Animal animal,Food food){
        System.out.println("主人"+getName()+"正在给"
                            +animal.getName()+"喂"+food.getName());
    }
}
