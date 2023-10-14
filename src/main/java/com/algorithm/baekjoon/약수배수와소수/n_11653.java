package com.algorithm.baekjoon.약수배수와소수;

import java.io.*;

public class n_11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        int num = Integer.parseInt(reader.readLine());

        for (int i = 2; i <= Math.sqrt(num); i++) {
            while (num % i == 0) {
                result.append(i).append("\n");
                num /= i;
            }
        }

        if (num != 1) {
            result.append(num);
        }

        System.out.println(result);
    }
}
