package com.algorithm.baekjoon.반복문;

import java.io.*;

public class n_2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        final int SIZE = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= SIZE; i++) {
            stringBuilder
                    .append(" ".repeat(SIZE - i))
                    .append("*".repeat(i))
                    .append("\n");
        }

        System.out.println(stringBuilder);
    }
}
