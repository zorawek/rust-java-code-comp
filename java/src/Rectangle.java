public class Rectangle implements Shape {
    final int a;
    final int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        return a * b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
