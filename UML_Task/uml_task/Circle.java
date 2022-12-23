package uml_task;

public class Circle {

    private double _radious ;
    private String _color ;
    public Circle() {

    }
    public Circle(double radious) {
        _radious=radious;
    }
    public Circle(double radious, String color) {
        _radious=radious;
        _color=color;
    }
    public double GetRadious() {
        return _radious;
    }
    public void SetRadious(double radious){
        _radious = radious;
    }
    public String GetColor(){
        return _color;
    }
    public void  SetColor (String color){
        _color=color;
    }

    @Override
    public String toString() {
        return "Circle{" + "_radious=" + _radious + ", _color=" + _color + '}';
    }
    
    public double getArea(){
        double area = 3.14*_radious*_radious;
        return area ;
    }
}
