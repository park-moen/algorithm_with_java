package com.algorithm.baekjoon.기하학직사각형과삼각형;

import java.io.*;

public class n_9063 {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static int minWidth = Integer.MAX_VALUE;
    private static int maxWidth = Integer.MIN_VALUE;
    private static int minHeight = Integer.MAX_VALUE;
    private static int maxHeight = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        firstSolution();
//        secondSolution();
    }

    private static void firstSolution() throws IOException {
        int N = Integer.parseInt(reader.readLine());
        int[][] coordinates = new int[N][2];

        for (int i = 0; i < N; i++) {
            String[] input = reader.readLine().split(" ");
            coordinates[i][0] = Integer.parseInt(input[0]);
            coordinates[i][1] = Integer.parseInt(input[1]);
        }

        for (int j = 0; j < N; j++) {
            minWidth = Math.min(coordinates[j][0], minWidth);
            minHeight = Math.min(coordinates[j][1], minHeight);
            maxWidth = Math.max(coordinates[j][0], maxWidth);
            maxHeight = Math.max(coordinates[j][1], maxHeight);
        }

        int width = maxWidth - minWidth;
        int height = maxHeight - minHeight;

        System.out.println(width * height);
    }

    private static void secondSolution() throws IOException {
        int N = Integer.parseInt(reader.readLine());

        while (N > 0) {
            String[] input = reader.readLine().split(" ");
            int width = Integer.parseInt(input[0]);
            int height = Integer.parseInt(input[1]);

            if (minWidth > width) {
                minWidth = width;
            }

            if (maxWidth < width) {
                maxWidth = width;
            }

            if (minHeight > height) {
                minHeight = height;
            }

            if (maxHeight < height) {
                maxHeight = height;
            }

            N--;
        }

        System.out.println((maxWidth - minWidth) * (maxHeight - minHeight));
    }
}
