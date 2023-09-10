package com.algorithm.baekjoon._1차원배열;

import java.io.*;

public class n_10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] NM = reader.readLine().split(" ");

        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);
        int[] basket = new int[N];

        for (int i = 0; i < M; i++) {
            String[] input = reader.readLine().split(" ");

            int start = Integer.parseInt(input[0]);
            int end = Integer.parseInt(input[1]);
            int basketNumber = Integer.parseInt(input[2]);

            for (int j = start - 1; j < end; j++) {
                basket[j] = basketNumber;
            }
        }

        for (int value : basket) {
            writer.write(value + " ");
        }

        writer.close();
    }
}
