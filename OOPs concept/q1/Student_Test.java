// 1. Model a Student with encapsulation
// Create a Student class with private fields: name, rollNo, marks. Add getters/setters with validation — marks must be between 0 and 100. Add a getGrade() method that returns A/B/C/F based on marks.
package q1;
import java.util.Scanner;

public class Student_Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many student details you want to enter : ");
        int n = sc.nextInt();
        sc.nextLine();
        Student[] students = new Student[n];
        for(int i = 0 ;i<n;i++){
            System.out.print("\nEnter name : ");
            String name = sc.nextLine();
            System.out.print("Enter roll number : ");
            String roll_no = sc.nextLine();
            System.out.print("Enter marks : ");
            double marks = sc.nextDouble();
            sc.nextLine();
            students[i] = new Student(name, roll_no, marks);
        }
        System.out.println("\n-----Student Report-----\n");
        for(int i = 0;i<n;i++){
            System.out.print("\n\nName : "+students[i].getName()+"\nRoll no : "+students[i].getRoll_no()+"\nMarks : "+students[i].getMarks()+"\nGrade of student : "+students[i].getGrade());
        }
        sc.close();
    }
}
