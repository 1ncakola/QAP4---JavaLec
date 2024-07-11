//compute are and perimeter. validation of it sides extending to shape1
public class Triangle1 extends Shape1 {
    private double side1;
    private double side2;
    private double side3;

    public Triangle1(double side1, double side2, double side3) {
        super("Triangle");
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            throw new IllegalArgumentException("The given sides do not form a valid triangle.");
        }
    }

    @Override
    public double computeArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double computePerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return super.toString() + ", Sides: " + side1 + ", " + side2 + ", " + side3;
    }
}
