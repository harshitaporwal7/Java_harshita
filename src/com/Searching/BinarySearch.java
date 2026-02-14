package com.Searching;

public class BinarySearch {
    static void main(String[] args) {
        int[] arr = {90, 80, 75, 63, 52, 44, 36, 28, 11, 7};
        int target = 28;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr , int target) {
         int start = 0;
         int end = arr.length-1;

         boolean isAscending = arr[start] < arr[end];

         while(start <= end) {
             int mid = start + (end - start)/2;

             if(arr[mid] == target) {
                 return mid;
             }

             if(isAscending) {
                 if (target < arr[mid]) {
                     end = mid - 1;
                 } else {
                     start = mid + 1;
                 }
             } else {
                 if (target > arr[mid]) {
                     end = mid - 1;
                 } else {
                     start = mid + 1;
                 }
             }
         }
         return -1;
    }
}
