public class Circle implements Shape {
    final float r;

    public Circle(float r) {
        this.r = r;
    }

    @Override
    public double area() {
        return (float) Math.PI * r * r;
    }
}
