public class Demo {
    public static void main(String[] args){
        Scalable[] shapes = {
            new Circle(2.0),
            new Ellipse(2.0, 1.0),
            new Triangle(6.0, 8.0),
            new EquilateralTriangle(7.0)
        };
        System.out.println("Before Scaling:");
        for ( Scalable shape : shapes){
            System.out.println(shape);
        }

        scalingAll(shapes, 3.0);

        System.out.println("\nAfter scaling: ");
        for(Scalable shape : shapes){
            System.out.println(shape);
        }
    }

    public static void scalingAll (Scalable[] scalables, double factor){
        for(Scalable scalable : scalables){
            scalable.scale(factor);
        }
    }
}
