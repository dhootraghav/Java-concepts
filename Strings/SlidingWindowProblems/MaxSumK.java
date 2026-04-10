package Strings.SlidingWindowProblems;

import java.util.Scanner;

public class MaxSumK {
    int maxSum(int arr[], int k){
        int sum = 0, max = 0;
        for(int i = 0;i < k;i++) sum += arr[i];
        max = sum;
        for(int i = k;i<arr.length;i++){
            sum += arr[i]-arr[i-k];
            max = Math.max(max, sum);
        }
        return max;
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
        System.out.println("Output : " +new MaxSumK().maxSum(arr, k));
        sc.close();
    }
}
