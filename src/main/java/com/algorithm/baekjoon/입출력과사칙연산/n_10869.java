package com.algorithm.baekjoon.입출력과사칙연산;

import java.io.*;
import java.util.StringTokenizer;

public class n_10869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer input = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(input.nextToken());
        int b = Integer.parseInt(input.nextToken());

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        br.close();
    }
}
