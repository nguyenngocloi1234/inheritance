package inheritance;

public class Cylinder extends Circle {

    private double height = 1;

    public Cylinder() {
    }

    public Cylinder( double height) {
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(String color, boolean filled, double radius, double height) {
        super(color, filled, radius);
        this.height = height;
    }

    public double getVolume(){
        return super.getArea()*this.height;
    }

    @Override
    public String toString() {
        return " A Cylinder with height = "
                + this.height
                +", which is a subclass of "
                +super.toString();
    }
}
