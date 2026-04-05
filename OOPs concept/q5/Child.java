package q5;

public class Child extends Parent {
    static void show(){ System.out.println("Child class - static function");}
    void display(){ System.out.println("child class - instance function");}
    public static void main(String[] args) {
        Parent p = new Child();
        p.show();
        p.display();
    }
}
