package com.algorithm.baekjoon.심화1;

import java.io.*;

public class n_2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());

//        firstSolution(N);
        secondSolution(N);
    }

    private static void firstSolution(int N) {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i; j++) {
                result.append(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                result.append("*");
            }

            result.append("\n");
        }

        for (int i = N - 1; i >= 1; i--) {
            for (int j = 1; j <= N - i; j++) {
                result.append(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                result.append("*");
            }

            result.append("\n");
        }


        System.out.println(result);
    }

    private static void secondSolution(int N) {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            result.append(" ".repeat(N - i));
            result.append("*".repeat(2 * i - 1));
            result.append("\n");
        }

        for (int i = N - 1; i >= 1; i--) {
            result.append(" ".repeat(N - i));
            result.append("*".repeat(2 * i - 1));
            result.append("\n");
        }

        System.out.println(result);
    }
}
