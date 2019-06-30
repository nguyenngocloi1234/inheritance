package inheritance;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z= 0.0f;
    private float[] arr = {super.getX(),super.getY(),z};

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        this.arr[0]=this.getX();
        this.arr[1]=this.getY();
        this.arr[2]= this.getZ();
        return arr;
    }



    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                ", arr=" + Arrays.toString(this.getXYZ()) +
                '}';
    }
}
