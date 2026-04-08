package Strings;

import java.util.Scanner;

public class WordCompress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        sc.close();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            int count = 0;
            while (i < s.length() && s.charAt(i) == c) {
                i++;
                count++;
            }
            sb.append(c).append(count);
        }
        System.out.println(sb.length() < s.length() ? sb : s);
    }
}