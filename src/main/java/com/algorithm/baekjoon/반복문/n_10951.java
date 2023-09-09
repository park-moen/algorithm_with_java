package com.algorithm.baekjoon.반복문;

import java.io.*;
import java.util.Arrays;

public class n_10951 {
    public static void main(String[] args) throws IOException {
        firstSolution();
        secondSolution();
    }

    private static void firstSolution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        String input;

        while ((input = reader.readLine()) != null) {
            int a = input.charAt(0) - '0';
            int b = input.charAt(2) - '0';

            stringBuilder.append(a + b).append("\n");
        }

        System.out.println(stringBuilder);
    }

    private static void secondSolution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        while (true) {
            String input = reader.readLine();

            if (input == null) {
                break;
            }

            int a = input.charAt(0) - '0';
            int b = input.charAt(2) - '0';

            stringBuilder.append(a + b).append("\n");
        }

        System.out.println(stringBuilder);
    }
}
