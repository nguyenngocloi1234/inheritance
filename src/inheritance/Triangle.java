package inheritance;

public class Triangle extends Shape {

    private float side1 = 1.0f;
    private float side2 = 1.0f;
    private float side3 = 1.0f;
    private float p = (side1+side2+side3)/2;
    public Triangle() {
    }

    public Triangle(float side1, float side2, float side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, float side1, float side2, float side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea(){
        return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
    }

    public float getPerimeter(){
       return side1+side2+side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", p=" + p +
                ",Area = "+this.getArea()+
                ",Perimeter = "+ this.getPerimeter()+
                '}';
    }
}
