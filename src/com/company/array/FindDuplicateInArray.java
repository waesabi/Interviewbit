package com.company.array;

/*
    Problem Link - https://www.interviewbit.com/problems/find-duplicate-in-array/
    Status - Accepted
 */
public class FindDuplicateInArray {


    public static void main(String[] args) {
        int[] arr = {3,4,1,4,1};
        int res = repeatedNumber(arr);
        System.out.println(res);
    }

    public static int repeatedNumber(final int[] A) {
        int size = A.length;
        for (int i = 0; i < size; i++) {
            int current = Math.abs(A[i]) - 1;
            if (A[current] < 0) {
                return current + 1;
            }
            else {
                A[current] = -A[current];
            }
        }
        return -1;
    }

}
