package com.algorithm.baekjoon.일반수학1;

import java.io.*;

public class n_2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());

        System.out.println(formula(N));
    }

    private static int formula(int N) {
        return  (int) Math.pow(Math.pow(2, N) + 1, 2);
    }
}
