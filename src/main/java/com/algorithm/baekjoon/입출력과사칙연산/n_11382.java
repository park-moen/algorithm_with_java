package com.algorithm.baekjoon.입출력과사칙연산;

import java.io.*;
import java.util.StringTokenizer;

public class n_11382 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer input = new StringTokenizer(br.readLine(), " ");

        long a = Long.parseLong(input.nextToken());
        long b = Long.parseLong(input.nextToken());
        long c = Long.parseLong(input.nextToken());

        System.out.println(a + b + c);
        br.close();
    }
}
