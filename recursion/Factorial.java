package recursion;

import java.util.Scanner;

public class Factorial {
    int fact(int num){
        if(num == 0 || num == 1) return 1;
        else return num * fact(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        sc.close();
        System.out.println("Factorial of "+num+" : "+new Factorial().fact(num));
    }
}
