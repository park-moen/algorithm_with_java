package com.algorithm.baekjoon.반복문;

import java.io.*;


public class n_25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        final int SIZE = Integer.parseInt(reader.readLine());

        stringBuilder.append("long ".repeat(SIZE / 4));
        stringBuilder.append("int");

        System.out.println(stringBuilder);
    }
}
