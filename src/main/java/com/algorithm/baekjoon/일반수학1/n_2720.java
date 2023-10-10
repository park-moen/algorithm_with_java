package com.algorithm.baekjoon.일반수학1;

import java.io.*;

public class n_2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        final int QUARTER = 25;
        final int DIME = 10;
        final int NICKEL = 5;
        final int PENNY = 1;
        final int N = Integer.parseInt(reader.readLine());

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int input = Integer.parseInt(reader.readLine());

            result.append(input / QUARTER).append(" ");
            input %= QUARTER;

            result.append(input / DIME).append(" ");
            input %= DIME;

            result.append(input / NICKEL).append(" ");
            input %= NICKEL;

            result.append(input / PENNY).append("\n");
        }

        System.out.println(result);
    }
}
