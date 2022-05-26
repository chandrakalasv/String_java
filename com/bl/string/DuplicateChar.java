package com.bl.string;

public class DuplicateChar {
    public static void main(String[] args) {
        String s = "javatjavac";
        String s1 = " ";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    break;
                }
                else {
                    s1 = s1.concat(String.valueOf(s.charAt(i)));
                    break;
                }
            }
        }
        System.out.println(s1);
    }
}

