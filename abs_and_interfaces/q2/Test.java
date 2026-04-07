package abs_and_interfaces.q2;

public class Test {
    public static void main(String[] args) {
        Intern i = new Intern("Atharva", 15000);
        Manager m = new Manager("Yashraj", 50000);
        System.out.println(i.name+" "+i.salary+" "+i.calculateBonus()+"\n"+m.name+" "+m.salary+" "+m.calculateBonus());
    }
}
