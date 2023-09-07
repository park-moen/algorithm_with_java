package com.algorithm.baekjoon.입출력과사칙연산;

import java.io.*;

public class n_2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        firstSolution(a, b);
        secondSolution(a, b);
        thirdSolution(a, b);

        br.close();
    }

    private static void firstSolution(int a, int b) {
        System.out.println(a * (b % 10));
        System.out.println(a * ((b % 100) / 10));
        System.out.println(a * (b / 100));
        System.out.println(a * b);
        System.out.println();
    }

    private static void secondSolution(int a, int b) {
        String transformIntToString = String.valueOf(b);

        System.out.println(a * (transformIntToString.charAt(2) - '0'));
        System.out.println(a * (transformIntToString.charAt(1) - '0'));
        System.out.println(a * (transformIntToString.charAt(0) - '0'));
        System.out.println(a * b);
        System.out.println();
    }

    private static void thirdSolution(int a, int b) {
        String intToString = String.valueOf(b);
        char[] stringToCharArray = intToString.toCharArray();

        System.out.println(a * (stringToCharArray[2] - '0'));
        System.out.println(a * (stringToCharArray[1] - '0'));
        System.out.println(a * (stringToCharArray[0] - '0'));
        System.out.println(a * b);
        System.out.println();
    }
}
