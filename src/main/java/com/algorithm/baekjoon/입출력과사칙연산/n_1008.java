package com.algorithm.baekjoon.입출력과사칙연산;

import java.io.*;
import java.util.StringTokenizer;

public class n_1008 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        StringTokenizer splitInput = new StringTokenizer(input, " ");

        double a = Double.parseDouble(splitInput.nextToken());
        double b = Double.parseDouble(splitInput.nextToken());

        System.out.println(a / b);
        br.close();
    }
}