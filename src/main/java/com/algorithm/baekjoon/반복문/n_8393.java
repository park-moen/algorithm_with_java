package com.algorithm.baekjoon.반복문;

import java.io.*;

public class n_8393 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        int sum = 0;

        for (int i = 1; i <= input; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
