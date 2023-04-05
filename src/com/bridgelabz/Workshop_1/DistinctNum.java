package com.bridgelabz.Workshop_1;

public class DistinctNum {
    public static void main(String args[]) {
        int arr1[] = new int[]{3, 4, 5};
        int arr2[] = new int[]{7, 4, 5};
        int arr3[];
        int result;


        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++)
            {
                if (arr1[i] == arr2[j]) {
                    System.out.print( arr1[i] + " ");

                }
            }
        }
    }

}
