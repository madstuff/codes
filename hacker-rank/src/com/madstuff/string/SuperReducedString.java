package com.madstuff.string;


import java.util.Scanner;

/**
 * Given a string of lower case characters, reduce the string to its shortest length
 * by doing a series of operations such that every adjacent pair that match delete them.
 *
 */
public class SuperReducedString {

    /**
     *
     * @param string
     * @return super reduced string or "Empty String" if string is empty.
     */
    private static String reducedString(String string) {
        StringBuilder builder = new StringBuilder(string);

        for (int i = 1; i < builder.length(); i++) {
            if (builder.charAt(i - 1) == builder.charAt(i)) {
                builder.delete(i-1, i+1);
                i = 0;
            }
        }

        if (builder.length() == 0)
            return "Empty String";
        else
            return builder.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();

        String reducedString = reducedString(string);

        System.out.println("Reduced String : " + reducedString);

        scanner.close();

    }
}
