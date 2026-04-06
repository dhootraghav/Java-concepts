package constructors;

public class Emmployee extends Person {
    String company;
    public Emmployee(String name, int age, String company){
        super(name, age);
        this.company = company;
    }
    public static void main(String[] args) {
        Emmployee e1 = new Emmployee("Sahil", 23, "Dentsu");
        Emmployee e2 = new Emmployee("Muskan", 26, "Tata motors");
        System.out.println(e1.age+" "+e1.name+" "+e1.company+"\n"+
        e2.age+" "+e2.name+" "+e2.company);
    }
}
