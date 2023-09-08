package com.algorithm.baekjoon.조건문;

import java.io.*;

public class n_2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");

//        firstSolution(input);
        secondSolution(input);
    }

    private static void firstSolution(String [] input) {
        int h = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        if (m < 45) {
            h--;
            m = 60 - (45 - m);

            if (h < 0) {
                h = 23;
            }

            System.out.printf("%d %d", h, m);
        } else {
            System.out.printf("%d %d", h, m - 45);
        }
    }

    private static void secondSolution(String[] input) {
        int h = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int earlyTime = ((h * 60) + m - 45);


        if (earlyTime < 0) {
            earlyTime += 60 * 24;
        }

        System.out.printf("%d %d", earlyTime / 60, earlyTime % 60);
    }
}
