package com.algorithm.baekjoon.반복문;

import java.io.*;

public class n_10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        while (true) {
            String[] input = reader.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            if (a + b == 0) { // (a == 0 && b == 0)
                break;
            }

            stringBuilder.append(a + b).append("\n");
        }

        System.out.println(stringBuilder);
    }
}
