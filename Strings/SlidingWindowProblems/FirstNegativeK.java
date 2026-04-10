package Strings.SlidingWindowProblems;

import java.util.Scanner;

public class FirstNegativeK {
    int[] firstNegative(int arr[], int k, int len){
        int result[] = new int[len];
        for(int i = 0;i < len;i++){
            for(int j = i;j < k+i;j++){
                if(arr[j] < 0){
                    result[i] = arr[j];
                    break;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("how many elements do you want to enter : ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter the elements : ");
        for(int i = 0;i<num;i++) arr[i] = sc.nextInt();
        System.out.print("Enter the value of k : ");
        int k = sc.nextInt();
        System.out.print("Output : ");
        int result[] = new int[arr.length-k+1];
        result = new FirstNegativeK().firstNegative(arr, k, arr.length-k+1);
        for(int i = 0;i<result.length;i++) System.out.print(result[i]+" ");
        sc.close();
    }
}
