package recursion;

import java.util.Scanner;

public class tower_of_hanoi {
    public void toh(int n, char source, char help, char dest){
        if(n > 0){
            toh(n-1, source, dest, help);
            System.out.println("Move disc from "+source+" to "+dest);
            toh(n-1, help, source, dest);
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the number of disc : ");
        Scanner sc = new Scanner(System.in);
        int disc = sc.nextInt();
        tower_of_hanoi ob = new tower_of_hanoi();
        ob.toh(disc, 'A', 'B', 'C');
        sc.close();
    }
}
