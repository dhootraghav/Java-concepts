package q3;

public class Rectangle extends Shape{
    public double l, b;
    public Rectangle(double l, double b){
        this.l = l;
        this.b = b;
    }
    @Override
    double area(){
        return l * b;
    }
}
