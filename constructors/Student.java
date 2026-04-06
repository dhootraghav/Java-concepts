//copy constructor concept 

package constructors;

public class Student {
    private String name;
    private double marks;
    public Student(String name, double marks){ this.name = name; this.marks = marks;}
    public Student(Student other){ this.name = other.name; this.marks = other.marks;}
    public static void main(String[] args) {
        Student s1 = new Student("Rajesh", 76);
        Student s2 = new Student(s1);
        s2.marks = 50;
        System.out.println("Marks of s1 : "+s1.marks+"\nMarks of s2 : "+s2.marks);
    }
}
