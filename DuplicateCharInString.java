package com.bl.string;

public class DuplicateCharInString {
    public static void main(String[] args) {
        String s = "jaavvaa";
        String s1 = " ";
        for (int i = 0; i < s.length(); i++) {
            Boolean count = false;
            for (int j = 0; j < s1.length(); j++) {
                if (s.charAt(i) == s1.charAt(j)) {
                    System.out.println(String.valueOf(s.charAt(i)));
                    count = true;
                    break;
                }
            }
        }
    }
}