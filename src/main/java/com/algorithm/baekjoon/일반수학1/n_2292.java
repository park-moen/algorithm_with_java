package com.algorithm.baekjoon.일반수학1;

import java.io.*;

public class n_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        final int N = Integer.parseInt(reader.readLine());
        int count = 1;
        int range = 2;

        if (N == 1) {
            System.out.println(1);
            return;
        }

        while (range <= N) {
            range = range + (count * 6);
            count++;
        }

        System.out.println(count);
    }
}
