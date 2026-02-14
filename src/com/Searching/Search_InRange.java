package com.Searching;

public class Search_InRange {
    static void main(String[] args) {
        int[] arr = {17, -8, 3, 8, 5, 19, 40};
        int target = 3;
        System.out.println(Search(arr, target, 1, 4));
    }

    static int Search(int arr[], int target, int start, int end) {
        if(arr.length == 0) {
            return -1;
        }
        for(int i = start; i<= end; i++) {
            int element = arr[i];
            if(element == target) {
                return i;
            }
        }
        return -1;
    }

}
