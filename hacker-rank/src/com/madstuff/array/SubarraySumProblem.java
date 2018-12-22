package com.madstuff.array;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Find if there exists a subarray whose sum is zero.
 *
 *
 * @author madstuff
 */
public class SubarraySumProblem {

    /**
     * Use prefix sum method to find if a prefix sum repeats or if prefix sum becomes
     * zero.
     *
     * @param a
     * @return
     */
    private static boolean subarraySum(int[] a) {
        Set<Integer> set = new HashSet<>();

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];

            if (a[i] == 0 || sum == 0 || set.contains(a[i])) {
                return true;
            }

            set.add(a[i]);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] a = {1, 4, -2, -2, 5, -4, 3};

        System.out.println(subarraySum(a));
    }
}
