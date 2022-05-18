package com.bl.string;

public class RemoveDuplicateCharInString {

    public static void main(String[] args) {
        String s = "javajavaa";
        String output = " ";
        for (int i = 0; i < s.length(); i++) {
            Boolean count = false;
            for (int j = 0; j < output.length(); j++) {
                if (s.charAt(i) == output.charAt(j)) {
                    count = true;
                    break;
                }
            }
            if (count == false) {
                output = output.concat(String.valueOf(s.charAt(i)));
            }
        }
        System.out.println(output);
    }
}
