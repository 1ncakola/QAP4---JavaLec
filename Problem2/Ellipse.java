public class Ellipse extends Shape {
    private double majorAxis;
    private double minorAxis;

    public Ellipse(double majorAxis, double minorAxis){
        this.majorAxis = majorAxis;
        this.minorAxis = minorAxis;
    }

    public double getMajorAxis(){
        return majorAxis;
    }

    public double getMinorAxis(){
        return minorAxis;
    }

    @Override
    public void scale(double factor){
        this.majorAxis *= majorAxis;
        this.minorAxis *= minorAxis;
    }

    @Override
    public String toString(){
        return "Ellipse with major Axis: " + majorAxis + "Ellipse with minor Axis: "+ minorAxis; 
    }
    
}
