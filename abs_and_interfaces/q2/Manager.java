package abs_and_interfaces.q2;

public class Manager extends Employee{
    double bonus;
    Manager(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    @Override
    double calculateBonus() {
        return 0.2*salary;
    }
    
}
