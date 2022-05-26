package com.bl.string;

public class StringReverse {
    public static void main(String[] args) {
        String s = "adbcd";
        String s1 = " ";
        for(int i = s.length()-1; i >= 0; i--){
            s1 = s1.concat(String.valueOf(s.charAt(i)));
            }
        System.out.println(s1);
        }
    }
