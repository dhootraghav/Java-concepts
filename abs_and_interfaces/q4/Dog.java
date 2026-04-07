package abs_and_interfaces.q4;

public class Dog extends Animal implements Domestic{
    @Override
    public void sound() {
        System.out.println("woof woof...");
    }
    @Override
    public void breathe(){
        System.out.println("Dog is breathing...");
    }
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.breathe();
        d.owner();
    }

}
