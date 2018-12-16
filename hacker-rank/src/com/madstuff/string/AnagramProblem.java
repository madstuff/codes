package com.madstuff.string;

/**
 * Given a string, divide it into two equal parts and find number of characters needed
 * to change to make the string anagram to another.
 */
public class AnagramProblem {

    /**
     *
     * @param string
     * @return count of total
     */
    public static int anagram(String string) {
        if (string.length() % 2 != 0)
            return -1;

        String first = string.substring(0, string.length()/2);
        String last = string.substring(string.length()/2);

        StringBuilder builder = new StringBuilder(last);
        int count = 0;
        for (int i = 0; i < first.length(); i++) {
            char c = first.charAt(i);
            int index = builder.indexOf(Character.toString(c));
            if (index == -1) {
                count++;
            } else {
                builder.deleteCharAt(index);
//                last = last.substring(0, index) + last.substring(index + 1);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int count = anagram("mvdalvkiopaufl");

        System.out.println(count);

    }
}
