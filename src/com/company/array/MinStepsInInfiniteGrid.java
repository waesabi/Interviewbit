package com.company.array;

import java.util.ArrayList;

/*
    Problem Link - https://www.interviewbit.com/problems/min-steps-in-infinite-grid/
    Status - Accepted
 */
public class MinStepsInInfiniteGrid {

    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int currentX = A.get(0);
        int currentY = B.get(0);
        int count = 0;
        for (int i = 1; i < A.size(); i++) {
            int destX = A.get(i);
            int destY = B.get(i);
            count += Math.max(
                    Math.abs(destX - currentX),
                    Math.abs(destY - currentY)
            );
            currentX = destX;
            currentY = destY;
        }
        return count;
    }
}
