package com.algorithm.baekjoon.기하학직사각형과삼각형;

import java.io.*;

public class n_3009 {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int[][] arr = new int[3][2];

        for (int i = 0; i < 3; i++) {
            String[] input = reader.readLine().split(" ");
            arr[i][0] = Integer.parseInt(input[0]);
            arr[i][1] = Integer.parseInt(input[1]);
        }

        StringBuilder coordinate = new StringBuilder();

        for (int j = 0; j < 2; j++) {
            if (arr[0][j] == arr[1][j]) {
                coordinate.append(arr[2][j]).append(" ");
            } else if (arr[0][j] == arr[2][j]) {
                coordinate.append(arr[1][j]).append(" ");
            } else {
                coordinate.append(arr[0][j]).append(" ");
            }
        }

        System.out.println(coordinate);
    }
}
