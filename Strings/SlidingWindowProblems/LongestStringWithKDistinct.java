package Strings.SlidingWindowProblems;

import java.util.Arrays;
import java.util.Scanner;

public class LongestStringWithKDistinct {
    public int longest(String s, int k){
        int result = 0, left = 0;
        int lastSeen[] = new int[26];
        Arrays.fill(lastSeen, -1);
        for(int right = 0;right<s.length();right++){
            char c = s.charAt(right);
            if(lastSeen[c - 'a'] >= left){
                left = lastSeen[c - 'a'] + 1;
            }
            lastSeen[c - 'a'] = right;
            result = Math.max(result, right-left+1);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string : ");
        String s = sc.nextLine();
        System.out.print("Enter the value of k : ");
        int k = sc.nextInt();
        LongestStringWithoutRepitition ob = new LongestStringWithoutRepitition();
        System.out.println(ob.longest(s, k));
        sc.close();
    }
}
