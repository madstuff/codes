package com.madstuff.string;

import java.util.Scanner;

/**
 * Given a string, shift each alphabet by a number of letters.
 *
 */
public class CaesarCipher {

    /**
     *
     * @param string
     * @param k
     * @return
     */
    private static String encrypt(String string, int k) {

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            builder.append(encryptChar(string.charAt(i), k));
        }

        return builder.toString();
    }

    /**
     *
     * @param c
     * @param k
     * @return
     */
    private static char encryptChar(char c, int k) {
        if (Character.isAlphabetic(c)) {
            int base = Character.isLowerCase(c) ? 'a' : 'A';

            int value = ((c + k - base) % 26) + base;

            return (char) value;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        int k = scanner.nextInt();

        String encryptedString = encrypt(string, k);

        System.out.println("Encrypted String : " + encryptedString);

    }

}
