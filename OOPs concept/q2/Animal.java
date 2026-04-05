package q2;
public class Animal {
    private String name;
    private int age;
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    public void makeSound(){
        System.out.println("Animal is making a sound...");
    }

    public static void main(String[] args) {
        Animal animals[] = new Animal[3];
        animals[0] = new Dog("Bruno",5);
        animals[1] = new Cat("Brijesh", 2);
        animals[2] = new Cow("gaumata", 8);
        for(int i = 0;i<animals.length;i++){
            System.out.print("\n"+animals[i].name+" of age "+animals[i].age+" says : ");
            animals[i].makeSound();
        }
    }
}
