package com.algorithm.baekjoon.반복문;

import java.io.*;

public class n_2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d", input, i, input * i);
            System.out.println();
        }
    }
}