package q3;
public abstract class Shape {
    abstract double area();
    void printArea(){
        System.out.println("The area is : "+String.format("%.2f",area()));
    }
    static double totalArea(Shape[] shapes){
        double total = 0.0;
        for(Shape s : shapes){
            total += s.area();
        }
        return total;
    }

    public static void main(String[] args) {
        Shape c = new Circle(5.4);
        Shape r = new Rectangle(3, 4);
        Shape t = new Triangle(2.4, 1.5);
        c.printArea();
        r.printArea();
        t.printArea();
        Shape shapes[] = new Shape[3];
        shapes[0] = c;
        shapes[1] = r;
        shapes[2] = t;
        System.out.println("Total area : "+String.format("%.2f",totalArea(shapes)));
    }
}
