package com.algorithm.baekjoon.문자열;

import java.io.*;

public class n_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");

        int left = Integer.parseInt(new StringBuilder().append(input[0]).reverse().toString());
        int right = Integer.parseInt(new StringBuilder().append(input[1]).reverse().toString());

        System.out.println(Math.max(left, right));
    }
}
