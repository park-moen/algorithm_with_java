package com.algorithm.baekjoon.문자열;

import java.io.*;
import java.util.Arrays;

public class n_11720 {
    public static void main(String[] args) throws IOException {
//        firstSolution();
        secondSolution();
    }

    private static void firstSolution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        reader.readLine();

        int sumOfNum = Arrays.stream(reader.readLine().split("")).mapToInt(Integer::parseInt).sum();

        System.out.println(sumOfNum);
    }

    private static void secondSolution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        reader.readLine();

        int sum = 0;

        for (byte value : reader.readLine().getBytes()) {
            sum += (value - '0'); // char 0 == int 48
        }

        System.out.println(sum);
    }
}
