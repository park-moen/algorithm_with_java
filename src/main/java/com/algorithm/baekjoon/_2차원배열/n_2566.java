package com.algorithm.baekjoon._2차원배열;

import java.io.*;

public class n_2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        final int N = 9;
        final int M = 9;

        int max = Integer.MIN_VALUE;
        int maxIndexX = 0;
        int maxIndexY = 0;

        for (int i = 0; i < N; i++) {
            String[] input = reader.readLine().split(" ");

            for (int j = 0; j < M; j++) {
                int value = Integer.parseInt(input[j]);

                if (max < value) {
                    max = value;
                    maxIndexX = i + 1;
                    maxIndexY = j + 1;
                }
            }
        }

        System.out.printf("%d\n%d %d", max, maxIndexX, maxIndexY);
    }
}
