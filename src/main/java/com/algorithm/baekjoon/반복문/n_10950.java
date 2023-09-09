package com.algorithm.baekjoon.반복문;

import java.io.*;

public class n_10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        int len = Integer.parseInt(reader.readLine());

        while (len > 0) {
            String[] input = reader.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            result.append(a + b).append("\n");
            len--;
        }

        System.out.println(result);
    }
}
