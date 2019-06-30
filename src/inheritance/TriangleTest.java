package inheritance;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);

        triangle = new Triangle(1.0f,2.0f,3.0f);
        System.out.println(triangle);

        triangle = new Triangle("yellow",false,1.0f,2.0f,3.0f);
        System.out.println(triangle);
    }
}
