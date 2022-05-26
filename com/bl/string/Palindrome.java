package com.bl.string;

public class Palindrome {
    public static void main(String[] args) {
        String input = "dad";
        String reverse = "";
        for(int i = input.length() - 1; i >= 0; i--) {
            reverse = reverse.concat(String.valueOf(input.charAt(i)));
            System.out.println(reverse);
        }
        if(input.equals(reverse)) {
            System.out.println("string is palindrome");
        }
        else {
            System.out.println("string is not palindrome");
        }
    }
}
