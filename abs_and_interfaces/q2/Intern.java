package abs_and_interfaces.q2;

class Intern extends Employee{
    double bonus;
    Intern(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    @Override
    double calculateBonus() {
        return 0.05*salary;
    }
}
