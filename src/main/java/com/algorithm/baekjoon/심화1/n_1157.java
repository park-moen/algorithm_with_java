package com.algorithm.baekjoon.심화1;

import java.io.*;
import java.util.*;


public class n_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();

        firstSolution(text);
    }

    private static void firstSolution(String text) {
        String textToUpperCase = text.toUpperCase();
        HashMap<Character, Integer> hash = new HashMap<>();

        for (int i = 0; i < textToUpperCase.length(); i++) {
            char word = textToUpperCase.charAt(i);

            hash.put(word, hash.getOrDefault(word, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        String maxWord = "";
        boolean isSame = false;

        for (char key : hash.keySet()) {
            int value = hash.get(key);

            if (max == value) {
                isSame = true;
            }

            if (max < value) {
                max = value;
                maxWord = String.valueOf(key);
                isSame = false;
            }
        }

        System.out.println(isSame ? "?" : maxWord);
    }

    private static void secondSolution(String text) {
    }
}
