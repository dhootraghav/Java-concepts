package Strings;

import java.util.Scanner;

public class Anagram {
    int[] count(String w1, int[] freq){
        for(char c : w1.toCharArray()){
            freq[c - 'a'] += 1;
        }
        return freq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first word : ");
        String word1 = sc.nextLine().toLowerCase().strip();
        System.out.print("Enter the second word : ");
        String word2 = sc.nextLine().toLowerCase().strip();
        sc.close();
        Anagram a = new Anagram();
        if(word1.length()!=word2.length()){
            System.out.println("Not Anagram");
            return;
        }
        int freq1[] = new int[26];
        freq1 = a.count(word1, freq1);
        int freq2[] = new int[26];
        freq2 = a.count(word2, freq2);
        for(int i = 0 ;i<26;i++){
            if(freq1[i] != freq2[i]){
                System.out.println("Not Anagram");
                return;
            }
        }
        System.out.println("Anagram");
    }
}
