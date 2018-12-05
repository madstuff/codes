package com.madstuff.string;

import java.util.Scanner;

/**
 * Given a string of characters containing A and B. Reduce it so that there are no adjacent
 * matching characters.
 *
 * @author madstuff
 */
public class AlternatingCharacters {

    /**
     *
     * @param string
     * @return count of deleted characters.
     */
    private static int alternatingCharacters(String string) {
        StringBuilder builder = new StringBuilder(string);
        int count = 0;

        for (int i = 1; i < builder.length(); i++) {
            if (builder.charAt(i-1) == builder.charAt(i)){
                builder.deleteCharAt(i-1);
                count++;
                i = 0;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();

        int count = alternatingCharacters(string);
        System.out.println("Count of total delete: " + count);

        scanner.close();
    }

}
