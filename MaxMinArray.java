package com.bl.array;

import java.util.Arrays;

public class MaxMinArray {
    public static void main(String[] args) {
        int[] elements = {1, 4, 6, 8, 9, 55, 88};
        Arrays.sort(elements);
        System.out.println("minimum number in array is " + elements[0]);
        System.out.println("maximum number in array is " + elements[6]);
    }
}
