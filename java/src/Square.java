public class Square implements Shape {
    final int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public double area() {
        return a * a;
    }

    public int getA() {
        return a;
    }
}
