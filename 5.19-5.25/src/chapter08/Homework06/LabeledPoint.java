package chapter08.Homework06;

public class LabeledPoint extends Point{

    private String tag;

    public LabeledPoint( String tag,double x, double y) {
        super(x, y);
        this.tag = tag;
    }

    @Override
    public String toString() {
        return super.toString()+"LabeledPoint{" +
                "tag='" + tag + '\'' +
                '}';
    }
}
