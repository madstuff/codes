package com.madstuff.array;

/**
 * Given a non-negative integer array. Find a contiguous subarray which
 * adds to a given number.
 *
 * @author madstuff
 */
public class SubarrayWithGivenSum {

    /**
     *
     * @param a given array.
     * @param sum given sum.
     * @return true if subarray exists, false otherwise.
     */
    private static boolean subarraySum(int[] a, int sum) {
        int currSum = 0;
        int l = 0; //left index.
        for (int i = 0; i < a.length; i++) {
            currSum += a[i];

            if (currSum == sum) {
                System.out.println("Subarray exists between " + l + " and " + i);
                return true;
            }

            while(currSum > sum && l < i){
                currSum -= a[l];
                l++;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 20, 3, 10, 5};
        int sum = 33;

        System.out.println(subarraySum(a, sum));
    }
}
