package recursion;

import java.util.Scanner;

public class Fibonacci {
    public int fibo(int num){
        if(num == 1) return 0;
        else if(num == 2) return 1;
        else return fibo(num-1) + fibo(num-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        Fibonacci f =new Fibonacci();
        sc.close();
        System.out.print("Fibonacci series till "+num+" : ");
        for(int i = 1;i<=num;i++){
            System.out.print(f.fibo(i)+" ");
        }
    }
}
