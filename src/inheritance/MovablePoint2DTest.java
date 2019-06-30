package inheritance;

public class MovablePoint2DTest {

    public static void main(String[] args) {
        MovablePoint2D movablePoint2D = new MovablePoint2D();
        System.out.println(movablePoint2D);

        movablePoint2D = new MovablePoint2D(2.0f, 3.0f);
        System.out.println(movablePoint2D);

        movablePoint2D = new MovablePoint2D(2.0f,5.0f,2.0f,3.0f);
        System.out.println(movablePoint2D);
    }
}
