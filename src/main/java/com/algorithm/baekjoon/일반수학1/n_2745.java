package com.algorithm.baekjoon.일반수학1;

import java.io.*;

public class n_2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");

        String N = input[0];
        int B = Integer.parseInt(input[1]);

        solution(N, B);
    }

    private static void solution(String N, int B) {
        int sum = 0;
        int factor = 0;

        for (int i = N.length() - 1; i >= 0; i--) {
            char extractChar = N.charAt(i);
            int temp = (int) (Math.pow(B, factor++));

            if ('A' <= extractChar && extractChar <= 'Z') {
                sum += (extractChar - 55) * temp;
            } else {
                sum += (extractChar - 48) * temp;
            }
        }

        System.out.println(sum);
    }
}
