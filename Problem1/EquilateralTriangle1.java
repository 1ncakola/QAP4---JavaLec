//Implement an equilateral triangle extending to triangle1.
public class EquilateralTriangle1 extends Triangle1 {

    public EquilateralTriangle1(double side) {
        super(side, side, side);
    }

    @Override
    public String toString() {
        return super.toString() + " (Equilateral)";
    }
}
