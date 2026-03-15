package com.Sorting;

import java.util.Arrays;

public class Insertion_sort {
    static void main(String[] args) {
        int[] arr = {7, 5 , 9 , 6 , 2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for(int j = i; j > 0; j--) {
                if(arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                }else{
                    break;
                }
            }
        }
    }
}
