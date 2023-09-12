package com.algorithm.baekjoon.심화1;

import java.io.*;

public class n_10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word = reader.readLine();

        firstSolution(word.split(" "));
        secondSolution(word);
    }

    private static void firstSolution(String[] word) {
        int left = 0;
        int right = word.length - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (!word[left++].equals(word[right--])) {
                isPalindrome = false;
            }
        }

        System.out.println(isPalindrome ? "1" : "0");
    }

    private static void secondSolution(String word) {
        String reverseWord = new StringBuilder(word).reverse().toString();

        System.out.println(word.equals(reverseWord) ? "1" : "0");
    }
}
