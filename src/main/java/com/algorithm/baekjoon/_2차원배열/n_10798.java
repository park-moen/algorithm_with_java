package com.algorithm.baekjoon._2차원배열;

import java.io.*;

public class n_10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        char[][] board = new char[5][15];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < board.length; i++) {
            String input = reader.readLine();

            max = Math.max(max, input.length());
            for (int j = 0; j < input.length(); j++) {
                board[i][j] = input.charAt(j);
            }
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < max; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][i] == '\0') {
                    continue;
                }
                result.append(board[j][i]);
            }
        }

        System.out.println(result);
    }
}
