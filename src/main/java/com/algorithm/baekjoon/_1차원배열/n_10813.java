package com.algorithm.baekjoon._1차원배열;

import java.io.*;

public class n_10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = reader.readLine().split(" ");

        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);
        int[] basket = new int[N];

        for (int i = 0; i < N; i++) {
            basket[i] = i + 1;
        }

        for (int i = 0; i < M; i++) {
            String[] input = reader.readLine().split(" ");

            int left = Integer.parseInt(input[0]) - 1;
            int right = Integer.parseInt(input[1]) - 1;
            int temp = basket[left];

            basket[left] = basket[right];
            basket[right] = temp;
        }

        StringBuilder result = new StringBuilder();

        for (int value : basket) {
            result.append(value).append(" ");
        }

        System.out.println(result);
    }
}
