package com.Searching;

public class Search_minimum {
    static void main(String[] args) {
        int[] arr = {-2, 8, 5, -4, 12, 9, 14};
        System.out.println(min(arr));
    }

    static int min(int[] arr) {
        int ans = arr[0];
        for(int i=1; i< arr.length; i++) {
            if (arr [i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
