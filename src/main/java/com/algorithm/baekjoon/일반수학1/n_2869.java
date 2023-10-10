package com.algorithm.baekjoon.일반수학1;

import java.io.*;

public class n_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");

        int up = Integer.parseInt(input[0]);
        int down = Integer.parseInt(input[1]);
        int length = Integer.parseInt(input[2]);

        int day = (length - down) / (up - down);

        if ((length - down) % (up - down) != 0) {
            day++;
        }

        System.out.println(day);
    }
}
