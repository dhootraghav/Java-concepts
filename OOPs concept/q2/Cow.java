package q2;
public class Cow extends Animal{
    public Cow(String name, int age){
        super(name, age);
    }
    @Override 
    public void makeSound(){
        System.out.println("mehh");
    }

}
