package q3;

public class Circle extends Shape{
    public double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    double area(){
        return 3.14 * radius * radius;
    }
}
