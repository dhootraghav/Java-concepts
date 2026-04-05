public class Student{
    private String name, roll_no;
    private double marks;
    public Student(String name, String roll_no, double marks){
        this.name = name;
        this.roll_no = roll_no;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }
    public String getRoll_no() {
        return roll_no;
    }
    public double getMarks() {
        return marks;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setRoll_no(String roll_no) {
        this.roll_no = roll_no;
    }
    public void setMarks(double marks) {
        if(marks <= 100 && marks >= 0) this.marks = marks;
    }

    public char getGrade(){
        if(this.marks > 84) return 'A';
        else if(this.marks > 69) return 'B';
        else if(this.marks > 39) return 'C';
        else return 'F';
    }
}