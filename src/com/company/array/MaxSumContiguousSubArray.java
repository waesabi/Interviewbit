package com.company.array;


/*
    Problem Link - https://www.interviewbit.com/problems/max-sum-contiguous-subarray/
    Status - Accepted
 */

public class MaxSumContiguousSubArray {

    public int maxSubArray(final int[] A) {
        int maxSum = Integer.MIN_VALUE;
        int sumSoFar = 0;
        for(int i = 0; i < A.length; i++) {
            sumSoFar += A[i];
            maxSum = Math.max(maxSum, sumSoFar);
            if(sumSoFar < 0) {
                sumSoFar = 0;
            }
        }
        return maxSum;
    }

}

