package com.algorithm.baekjoon.입출력과사칙연산;

import java.io.*;
import java.util.StringTokenizer;

public class n_1001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(a - b);
        br.close();
    }
}
