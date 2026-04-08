package Strings;
import java.util.*;
public class NonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string : ");
        String s = sc.nextLine().toLowerCase();
        int freq[] = new int[26];
        for(char c : s.toCharArray()){
            freq[c - 'a'] += 1;
        }
        sc.close();
        for(char c : s.toCharArray()){
            if(freq[c - 'a'] == 1){
                System.out.println("Output : "+c);
                return;
            }
        }
        System.out.println("Output : -");
    }
}
