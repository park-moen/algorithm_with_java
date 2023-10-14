package com.algorithm.baekjoon.약수배수와소수;

import java.io.*;

public class n_1978 {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static int count = 0;

    public static void main(String[] args) throws IOException {
        int len = Integer.parseInt(reader.readLine());
        String[] N = reader.readLine().split(" ");

        for (int i = 0; i < len; i++) {
            if (isPrimeNum(Integer.parseInt(N[i]))) {
                count++;
            }
        }

        System.out.println(count);
    }

    private static boolean isPrimeNum(int num) {
        if (num == 1) {
            return false;
        }

        int sqrt = (int) Math.sqrt(num);

        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
}
