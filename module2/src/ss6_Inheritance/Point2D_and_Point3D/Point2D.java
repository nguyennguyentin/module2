package ss6_Inheritance.Point2D_and_Point3D;

public class Point2D {
    public float x;
    public float y;

    public Point2D() {
        this.x = 0;
        this.y = 0;
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY (float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
        float[] xy = new float[2];
        xy[0]=x;
        xy[1]=y;
        return xy;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
