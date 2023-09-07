package com.algorithm.baekjoon.입출력과사칙연산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n_10998 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        StringTokenizer splitInput = new StringTokenizer(input, " ");

        int a = Integer.parseInt(splitInput.nextToken());
        int b = Integer.parseInt(splitInput.nextToken());

        System.out.println(a * b);
        br.close();
    }
}
