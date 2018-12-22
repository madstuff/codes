package com.madstuff.string;

public class StringReverse {

    /**
     * Checks for Palindrome.
     *
     * @param args
     */
    public static void main(String[] args) {

        String name = "naman";
        String reverse = new StringBuilder(name).reverse().toString();

        System.out.println(reverse);

        System.out.println(name.equalsIgnoreCase(reverse));

    }
}
