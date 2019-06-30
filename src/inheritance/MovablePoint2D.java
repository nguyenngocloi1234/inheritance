package inheritance;

import java.util.Arrays;

public class MovablePoint2D extends Point2D {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    private float[] arr={xSpeed,ySpeed};
    private float[] movablePoint2Darr = {this.getX()+xSpeed, this.getY()+ySpeed};

    public MovablePoint2D(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint2D(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint2D() {
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getArr(){
        this.arr[0] = this.getXSpeed();
        this.arr[1]= this.getYSpeed();
        return arr;
    }

    public float[] move(){
        this.movablePoint2Darr [0]=this.getX()+this.xSpeed;
        this.movablePoint2Darr[1] = this.getY()+this.ySpeed;
        return movablePoint2Darr;
    }


    @Override
    public String toString() {
        return "MovablePoint2D{" +
                " x = "+
                this.getX()+
                " y = "+
                this.getY()+

                " xSpeed= " + xSpeed +
                ", ySpeed= " + ySpeed +
                ", arr= " + Arrays.toString(this.getArr()) +
                ", movablePoint2Darr = "+ Arrays.toString(this.move())+
                '}';
    }
}
