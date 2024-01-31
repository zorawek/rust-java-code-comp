public class Triangle implements Shape {
    final float a;
    final float h;

    public Triangle(float a, float h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double area() {
        return a * h * 0.5f;
    }

    public float getA() {
        return a;
    }

    public float getH() {
        return h;
    }
}
