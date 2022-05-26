package com.bl.string;

public class StringRotation {
        public static void main(String[] args) {
            String s1 = "xyz";
            String s2 = "zux";
            int a = s1.length() - 1;
            int flag = 0;
            for (int i = 0,j = a; i <= a;j--, i++) {

                if (s1.charAt(i) == s2.charAt(j)) {
                    flag = 1;
                } else {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println("Strings are  rotation of each other");
            }
            else {
                System.out.println("Strings are  not rotation of each other");
            }
        }

    }


