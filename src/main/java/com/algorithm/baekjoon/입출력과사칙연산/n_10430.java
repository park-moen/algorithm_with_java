package com.algorithm.baekjoon.입출력과사칙연산;

import java.io.*;
import java.util.StringTokenizer;

public class n_10430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer input = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(input.nextToken());
        int B = Integer.parseInt(input.nextToken());
        int C = Integer.parseInt(input.nextToken());

        System.out.println((A + B) % C);
        System.out.println(((A % C) + (B % C)) % C);
        System.out.println((A * B) % C);
        System.out.println(((A % C) * (B % C)) % C);

        br.close();
    }
}
