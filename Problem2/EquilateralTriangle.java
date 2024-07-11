public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(double side){
        super(side, (Math.sqrt(3) / 2) * side);
    } 
    @Override
    public void scale(double factor){
        double side = getBase() * factor;
        //double height = (Math.sqrt(3) / 2) * side;
        setBase(side);
        //setHeight(height);
    }
//The height can be derived from the side lenght(base)
    

    @Override
    public String toString(){
        return "EquilateralTriangle with side: " + getBase();
    }
}
