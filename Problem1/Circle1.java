// Compute are and perimeter  extending to shape1
public class Circle1 extends Shape1 {
    private double radius;

    public Circle1(double radius) {
        super("Circle1");
        this.radius = radius;
    }

    @Override
    public double computeArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double computePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return super.toString() + ", Radius: " + radius;
    }
}
