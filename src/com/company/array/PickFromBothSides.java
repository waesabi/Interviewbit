package com.company.array;

import java.util.ArrayList;

/*
    Problem Link - https://www.interviewbit.com/problems/pick-from-both-sides/
    Status - Accepted
 */
public class PickFromBothSides {

    public static void main(String[] args) {
        int[] arr = { -533, -666, -500, 169, 724, 478, 358, -38, -536, 705, -855, 281, -173, 961, -509, -5, 942, -173
                , 436, -609, -396, 902, -847, -708, -618, 421, -284, 718, 895, 447, 726, -229, 538, 869, 912, 667, -701, 35, 894, -297, 811, 322, -667, 673, -336, 141, 711, -747, -132, 547, 644, -338, -243, -963, -141, -277, 741, 529, -222, -684, 35 };
        System.out.println(arr.length);
        int b = 48;
        int ans = solve(arr, b);
        System.out.println(ans);
    }


    public static int solve(int[] A, int B) {
        int size = A.length;

        //Construct the list
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = B-1; i >= 0; i--) {
            list.add(A[i]);
        }

        int index = size - B;
        for (int i = size - 1; i >= index ; i--) {
            list.add(A[i]);
        }


        // Now find the max sum subarray of size B
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < B; i++) {
            sum += list.get(i);
        }
        maxSum = Math.max(maxSum, sum);
        for (int i = B; i < list.size(); i++) {
            sum = sum + list.get(i) - list.get(i - B);
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

}
