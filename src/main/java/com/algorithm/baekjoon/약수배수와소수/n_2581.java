package com.algorithm.baekjoon.약수배수와소수;

import java.io.*;

public class n_2581 {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int min = Integer.parseInt(reader.readLine());
        int max = Integer.parseInt(reader.readLine());
        int sum = 0;
        int minPrimeNumber = Integer.MAX_VALUE;


        for (int i = min; i <= max; i++) {
            if (isPrimeNumber(i)) {
                sum += i;
                minPrimeNumber = Math.min(minPrimeNumber, i);
            }
        }

        printResult(sum, minPrimeNumber);
    }

    private static boolean isPrimeNumber(int num) {
        if (num == 1) {
            return false;
        }

        int sqrt = (int) Math.sqrt(num);

        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static void printResult(int sum, int minPrimeNumber) {
        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(minPrimeNumber);
        }
    }
}
