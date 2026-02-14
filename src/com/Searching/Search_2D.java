package com.Searching;

import java.util.Arrays;

public class Search_2D {
    public static void main(String[] args) {
        int[][] arr = {
                {24, 17, 32},
                {4, 9, 8, 7},
                {12, 18}
        };
        int target = 7;

        System.out.println(Arrays.toString(search(arr, target)));
        System.out.println(Arrays.toString(max(arr)));
    }

    static int[] search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int[] max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        int row = -1;
        int col = -1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int[]{row, col};
    }
}