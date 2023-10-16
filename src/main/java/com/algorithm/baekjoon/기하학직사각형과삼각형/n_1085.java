package com.algorithm.baekjoon.기하학직사각형과삼각형;

import java.io.*;

public class n_1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");

        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int w = Integer.parseInt(input[2]);
        int h = Integer.parseInt(input[3]);


        int minWidth = Math.min(x, (w - x));
        int minHeight = Math.min(y, (h - y));

        System.out.println(Math.min(minWidth, minHeight));
    }
}
