package com.algorithm.baekjoon._2차원배열;

import java.io.*;

public class n_2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int total = 0;
        boolean[][] board = new boolean[101][101];

        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");

            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);

            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    if (!board[j][k]) {
                        board[j][k] = true;
                        total++;
                    }
                }
            }
        }

        System.out.println(total);
    }

}
