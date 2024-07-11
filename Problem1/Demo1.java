//Create and display shape objects
public class Demo1 {

    public static void main(String[] args) {
        Shape1[] shapes = new Shape1[] {
            new Circle1(5),
            new Ellipse1(4, 2),
            new Triangle1(3, 4, 5),
            new EquilateralTriangle1(3)
        };

        for (Shape1 shape : shapes) {
            System.out.println(shape);
        }
    }
}
