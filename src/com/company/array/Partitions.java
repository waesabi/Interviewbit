package com.company.array;

/*
    Problem Link - https://www.interviewbit.com/problems/partitions/
    Status - Accepted
 */
public class Partitions {

    public static void main(String[] args) {
        int A = 5;
        int[] B = {1,2,3,0,3};
        int count = solve(A, B);
        System.out.println(count);
    }

    public static int solve(int A, int[] B) {
        int count = 0;
        if (A < 3)  { return count; }
        // Calculate prefix sum
        for (int i = 1; i < A; i++) {
            B[i] += B[i-1];
        }
        for (int i = 0; i < A; i++) {
            int leftSum = B[i];
            for (int j = i+1; j < A - 1; j++) {
                int middleSum = B[j] - B[i];
                int endSum = B[A-1] - B[j];
                System.out.println(i + " " + j + " "  + leftSum + " " + middleSum + " " + endSum);
                if (leftSum == endSum && endSum == middleSum) {
                    count++;
                }
            }
        }

        return count;
    }
}
