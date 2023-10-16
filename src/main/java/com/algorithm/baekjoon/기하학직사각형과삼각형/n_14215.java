package com.algorithm.baekjoon.기하학직사각형과삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class n_14215 {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        firstSolution();
//        secondSolution();
    }

    private static void firstSolution() throws IOException {
        int[] arr = Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .sorted().
                toArray();

        if ((arr[0] + arr[1]) > arr[2]) {
            System.out.println(arr[0] + arr[1] + arr[2]);
        } else {
            System.out.println((arr[0] + arr[1]) * 2 - 1);
        }
    }

    private static void secondSolution() throws IOException {
        String[] input = reader.readLine().split(" ");

        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

        int max = Math.max(a, Math.max(b, c));
        int sumOfRestSide = (a + b + c) - max;

        if (max < sumOfRestSide) {
            System.out.println(a + b + c);
        } else {
            System.out.println(sumOfRestSide * 2 - 1);
        }
    }
}
