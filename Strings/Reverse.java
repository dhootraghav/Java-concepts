package Strings;

import java.util.Scanner;

public class Reverse {
    String reverse_string(String word){
        String reverse_word = "";
        for(int i = word.length()-1;i>-1;i--){
            reverse_word += word.charAt(i);
        }
        return reverse_word;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Reverse r = new Reverse();
        System.out.print("Enter any word : ");
        String word = sc.nextLine(), reverse_word = r.reverse_string(word);
        System.out.println("Word : "+word);
        System.out.println("Reversed word : "+reverse_word);

        //check palindrom 
        if(word.equalsIgnoreCase(reverse_word)) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");

        sc.close();
    }
}
