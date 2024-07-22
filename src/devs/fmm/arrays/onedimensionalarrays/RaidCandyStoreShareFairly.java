package devs.fmm.arrays.onedimensionalarrays;

import java.util.Arrays;

public class RaidCandyStoreShareFairly {
    private static int relativeDifference(int a, int b) {
        if (a == b) return 0;
        int absoluteDifference = Math.abs(a - b);
        return (int) (100. * absoluteDifference / Math.max(a, b));
    }

    private static int findSplitPoint(int[] values) {

        // Each index will contain the sum from left
        int[] sumFromLeft = new int[values.length];
        int sumLeft = 0;
        // Each index will contain the sum from right
        int[] sumFromRight = new int[values.length];
        int sumRight = 0;
        for (int value : values) {
            sumRight += value;
        }

        for (int i = 0, j = values.length - 1; i < values.length; i++, j--) {
            sumLeft += values[i];
            sumFromLeft[i] = sumLeft;


            sumFromRight[i] = sumRight;
            sumRight -= values[i];
            System.out.println();
            System.out.println("Candy weights: "+Arrays.toString(values));
            System.out.println("SumFromLeft: " + Arrays.toString(sumFromLeft));
            System.out.println("SumFromRight: " + Arrays.toString(sumFromRight));

            System.out.println("Junior: " + sumFromLeft[i] + " Jackie: " + sumFromRight[i] + " relativeDifference: " + relativeDifference(sumFromLeft[i], sumFromRight[i]) + " index: " + i);
            if (relativeDifference(sumFromLeft[i], sumFromRight[i]) <= 10) return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] values = {10, 20, 30, 40, 50};

        System.out.println(findSplitPoint(values));
    }

}
