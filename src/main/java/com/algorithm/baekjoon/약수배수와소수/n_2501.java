package com.algorithm.baekjoon.약수배수와소수;

import java.io.*;

public class n_2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        int count = 0;
        int result = 0;

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count++;
            }

            if (count == K) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}
