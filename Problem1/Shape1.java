// Compute area, perimeter and tostring method. 
public abstract class Shape1 {
    private String name;

    public Shape1(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }


    //Abstract Method
    public abstract double computePerimeter();
    public abstract double computeArea();

    @Override
    public String toString(){
        return "Shape" + name + ", Perimeter: " + computePerimeter() + " Area: " + computeArea();
    }
}