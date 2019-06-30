package inheritance;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(3.0);
        System.out.println(cylinder);

        cylinder = new Cylinder(2.0, 3.0);
        System.out.println(cylinder);

        cylinder = new Cylinder("yellow",true,2.0,3.0);
        System.out.println(cylinder);

    }
}
