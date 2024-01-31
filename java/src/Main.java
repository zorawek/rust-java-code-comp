import java.util.Collection;

public class Main {

    public double calculate_areas_all(Collection<Shape> shapes) {
        return shapes.stream().mapToDouble(Shape::area).sum();
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}