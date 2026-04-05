package constructors;

public class Car {
    String brand, model, speed;
    public Car(){}
    public Car(String brand){ this.brand = brand;}
    public Car(String brand, String model, String speed){
        this.brand = brand;
        this.model = model; 
        this.speed = speed;
    }
    void print(){
        System.out.println("\n"+ this.brand+ " "+ this.model+" "+ this.speed);
    }
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.print();
        Car c2 = new Car("Audi");
        c2.print();
        Car c3 = new Car("BMW", "X5", "200mph");
        c3.print();
    }
}
