package recursion;

import java.util.Scanner;

public class BinarySearch {
    int search(int[] arr,int element, int start, int end){
        if(start <= end){
            int mid = (start+end)/2;
            if(element == arr[mid]) return mid;
            else if(element > arr[mid]){
                return search(arr, element, mid+1, end);
            }
            else{
                return search(arr, element, start, mid-1);
            }
        }
        else return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements do you want to enter : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("\nEnter the elements in a sorted order : ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("\nEnter the element to be searched : ");
        int search_element = sc.nextInt();
        int pos = new BinarySearch().search(arr, search_element,0, n-1);
        if(pos == -1) System.out.println("The element is not present!");
        else System.out.println("The element is present at position : "+(pos+1));
        sc.close();
    }
}
