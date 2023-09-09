package com.algorithm.baekjoon.반복문;

import java.io.*;

public class n_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        final int SIZE = Integer.parseInt(reader.readLine());

        for (int i = 0; i < SIZE; i++) {
            String[] input = reader.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            stringBuilder.append(a + b).append("\n");
        }

        System.out.println(stringBuilder);
    }
}
