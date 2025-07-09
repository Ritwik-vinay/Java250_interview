package JavaWeek1;

abstract class shape {
    abstract double calculateArea();
    void displayType() {
        System.out.println("This is a shape.");
    }
}
class rectangle extends shape{
    private double length;
    private double width;

    // Constructor
    public rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override calculateArea method
    @Override
    double calculateArea() {
        return length * width;
    }
}

class circle extends shape{
    private double radius;
    public circle(double radius) {
        this.radius = radius;
    }

    // Override calculateArea method
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }


}
public class ShapePolymorphism {
    public static void main(String[] args) {
        // Polymorphic references
        shape c = new circle(5.0);
        shape r = new rectangle(4.0, 6.0);

        System.out.println("Circle Area: " + c.calculateArea());
        System.out.println("Rectangle Area: " + r.calculateArea());
    }
}