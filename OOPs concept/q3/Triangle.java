package q3;

public class Triangle extends Shape{
    public double b, h;
    public Triangle(double b, double h){
        this.b = b;
        this.h = h;
    }
    @Override
    double area(){
        return 0.5 * b * h;
    }
}
