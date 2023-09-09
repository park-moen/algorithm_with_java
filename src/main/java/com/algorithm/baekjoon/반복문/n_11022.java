package com.algorithm.baekjoon.반복문;

import java.io.*;

public class n_11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        final String PREFIX = "Case #";
        final int SIZE = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= SIZE; i++) {
            String[] input = reader.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            stringBuilder
                    .append(PREFIX)
                    .append(i)
                    .append(": ");

            stringBuilder
                    .append(a)
                    .append(" + ")
                    .append(b)
                    .append(" = ")
                    .append(a + b)
                    .append("\n");
        }

        System.out.println(stringBuilder);
    }
}
