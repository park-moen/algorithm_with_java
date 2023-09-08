package com.algorithm.baekjoon.조건문;

import java.io.*;

public class n_2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] timeArray = reader.readLine().split(" ");
        final int COOK_TIME = Integer.parseInt(reader.readLine());

        firstSolution(timeArray, COOK_TIME);
        System.out.println();
        secondSolution(timeArray, COOK_TIME);

    }

    private static void firstSolution(String[] timeArray, int COOK_TIME) {
        int h = Integer.parseInt(timeArray[0]);
        int m = Integer.parseInt(timeArray[1]) + COOK_TIME ;

        if (m >= 60) {
            h += m / 60;
            m = m % 60;

            if (h >= 24) {
                h -= 24;
            }

            System.out.printf("%d %d", h, m);
        } else {
            System.out.println(h + " " + m);
        }
    }

    private static void secondSolution(String[] timeArray, int COOK_TIME) {
        int h = Integer.parseInt(timeArray[0]);
        int m = Integer.parseInt(timeArray[1]) + COOK_TIME;
        int total = h * 60 + m;

        System.out.printf("%d %d", (total / 60) % 24, total % 60);
    }
}
