public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public double getBase(){
        return base;
    }

    public double getHeight(){
        return height;
    }
    
    public void setBase(double base){
        this.base = base;
    }

    public void setHeight(double height){
        this.height = height;
    }

    
    @Override
    public void scale(double factor){
        this.base *= factor;
        this.height *= factor;
    }

    @Override
    public String toString(){
        return "Triangle with base: "+ base + "Triangle with height: " + height;
    }
}
