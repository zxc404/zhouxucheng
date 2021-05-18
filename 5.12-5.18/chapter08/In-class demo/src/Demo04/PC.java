package Demo04;

public class PC extends Computer{
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void showPC(PC pc){
        System.out.println(pc.getBrand());
        System.out.println(pc.getCpu());
        System.out.println(pc.getDisk());
        System.out.println(pc.getStorage());
    }
}
