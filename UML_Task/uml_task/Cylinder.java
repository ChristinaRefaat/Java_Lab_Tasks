
package uml_task;

public class Cylinder extends Circle{
    private double _height;
    Circle c = new Circle();
    double CYRadious=c.GetRadious();
    String CYColor= c.GetColor();
    @Override
    public double getArea(){
        double area = 2*3.14*(CYRadious*CYRadious+CYRadious*_height);
        return area ;
    }
    public Cylinder(){
        
    }
    public Cylinder (double height){
        _height=height;
    }
    public Cylinder (double height,double radious){
        _height=height;
        CYRadious=radious;
    }
    public Cylinder (double height,double radious,String color){
        _height=height;
        CYRadious=radious;
        CYColor=color;
    }
    public double getHeight(){
        return _height;
    }
    public void setHeight(double height){
        _height=height;
    }

    @Override
    public String toString() {
        return "Cylinder{" + "_height=" + _height + '}';
    }
    public double getVolume(){
        double volume = 3.14*c.GetRadious()*c.GetRadious()*_height;
        return volume;
    }
}
