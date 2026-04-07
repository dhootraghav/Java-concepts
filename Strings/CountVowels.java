package Strings;
import java.util.*;
public class CountVowels {
    int vow(String word){
        int num_of_vow = 0;
        String vowel = "aeiouAEIOU";
        for(char w : word.toCharArray()){
            if(vowel.indexOf(w) > -1) num_of_vow++;
        }
        return num_of_vow;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any word : ");
        String word = sc.nextLine();
        System.out.println("Number of vowels : "+new CountVowels().vow(word));
        sc.close();
    }
}
