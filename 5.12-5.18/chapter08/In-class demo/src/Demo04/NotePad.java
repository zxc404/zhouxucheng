package Demo04;

public class NotePad extends Computer{

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void showNote(NotePad pc){
        System.out.println(pc.getColor());
        System.out.println(pc.getCpu());
        System.out.println(pc.getDisk());
        System.out.println(pc.getStorage());
    }

}
