package com.algorithm.baekjoon._2차원배열;

import java.io.*;

public class n_2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] NM = reader.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);
        int[][] array1 = new int[N][M];
        int[][] array2 = new int[N][M];

        for (int i = 0; i < N; i++) {
            String[] temp = reader.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                array1[i][j] = Integer.parseInt(temp[j]);
            }
        }

        for (int i = 0; i < N; i++) {
            String[] input = reader.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                array2[i][j] = Integer.parseInt(input[j]);
            }
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                result.append(array1[i][j] + array2[i][j]);
                result.append(" ");
            }
            result.append("\n");
        }

        System.out.println(result);
    }
}
