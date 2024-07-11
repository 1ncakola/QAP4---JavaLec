//Compute area and approx. perimeter extending shape1
public class Ellipse1 extends Shape1 {
    private double majorAxis;
    private double minorAxis;

    public Ellipse1(double majorAxis, double minorAxis) {
        super("Ellipse1");
        this.majorAxis = majorAxis;
        this.minorAxis = minorAxis;
    }

    @Override
    public double computeArea() {
        return Math.PI * majorAxis * minorAxis;
    }

    @Override
    public double computePerimeter() {
        return Math.PI * Math.sqrt(2 * (majorAxis * majorAxis + minorAxis * minorAxis));
    }

    @Override
    public String toString() {
        return super.toString() + ", Major Axis: " + majorAxis + ", Minor Axis: " + minorAxis;
    }
}
