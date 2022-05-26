package com.bl.string;

public class RemoveCharFromString {
    public static void main(String[] args) {
        String s = "demo program";
        String s2 = "gra";
        String s3 = " ";
        for (int i = 0; i < s.length(); i++) {
            boolean found = false;
            for (int j = 0; j < s2.length(); j++) {

                if (s.charAt(i) == s2.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                s3 = s3.concat(String.valueOf(s.charAt(i)));
            }
        }
        System.out.println(s3);
    }
}

