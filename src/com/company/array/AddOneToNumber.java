package com.company.array;

import java.util.ArrayList;
import java.util.Collections;

/*
    Problem Link - https://www.interviewbit.com/problems/add-one-to-number/
    Status - Accepted
 */
public class AddOneToNumber {

    public static void main(String[] args) {
        int[] arr = {0, 3, 7, 6, 4, 0, 5, 5, 5};
        ArrayList<Integer> list = new ArrayList<>();
        for (int val: arr) {
            list.add(val);
        }
        plusOne(list);
    }

    public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int carry = 1;
        int size = A.size();
        ArrayList<Integer> finalList = new ArrayList<>();
        for (int i = size - 1; i >= 0; i--) {
            int sum = A.get(i) + carry;
            if (sum >= 10) {
                carry = 1;
                finalList.add(0);
            }
            else {
                carry = 0;
                finalList.add(sum);
            }
        }
        if (carry == 1) {
            finalList.add(1);
        }
        Collections.reverse(finalList);

        System.out.println(finalList);
        while (finalList.size() > 0 && finalList.get(0) == 0) {
            finalList.remove(0);
        }
        System.out.println(finalList);
        return finalList;
    }

}
