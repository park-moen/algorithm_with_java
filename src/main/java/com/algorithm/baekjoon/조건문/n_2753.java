package com.algorithm.baekjoon.조건문;

import java.io.*;

public class n_2753 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());

        firstSolution(year);
        secondSolution(year);

        br.close();
    }

    private static void firstSolution(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }

    private static void secondSolution(int year) {
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

        System.out.println(isLeapYear ? "1" : "0");
    }
}
