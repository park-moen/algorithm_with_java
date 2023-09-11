package com.algorithm.baekjoon.문자열;

import java.io.*;

public class n_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        firstSolution(input);
        secondSolution(input);
    }

    private static void firstSolution(String input) {
        int totalTime = 0;

        for (int i = 0; i < input.length(); i++) {

            switch (input.charAt(i)) {
                case 'A', 'B', 'C' -> totalTime += 3;
                case 'D', 'E', 'F' -> totalTime += 4;
                case 'G', 'H', 'I' -> totalTime += 5;
                case 'J', 'K', 'L' -> totalTime += 6;
                case 'M', 'N', 'O' -> totalTime += 7;
                case 'P', 'Q', 'R', 'S' -> totalTime += 8;
                case 'T', 'U', 'V' -> totalTime += 9;
                case 'W', 'X', 'Y', 'Z' -> totalTime += 10;
                default -> totalTime += 11;
            }
        }

        System.out.println(totalTime);
    }

    private static void secondSolution(String input) {
        int totalTime = 0;

        for (int i = 0; i < input.length(); i++) {

            switch (input.charAt(i) - 64) {
                case 1, 2, 3 -> totalTime += 3;
                case 4, 5, 6 -> totalTime += 4;
                case 7, 8, 9 -> totalTime += 5;
                case 10, 11, 12 -> totalTime += 6;
                case 13, 14, 15 -> totalTime += 7;
                case 16, 17, 18, 19 -> totalTime += 8;
                case 20, 21, 22 -> totalTime += 9;
                case 23, 24, 25, 26 -> totalTime += 10;
                default -> totalTime += 11;
            }
        }

        System.out.println(totalTime);
    }
}
