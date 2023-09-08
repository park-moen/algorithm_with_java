package com.algorithm.baekjoon.조건문;

import java.io.*;
import java.util.StringTokenizer;

public class n_1330 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer input = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(input.nextToken());
        int b = Integer.parseInt(input.nextToken());

        if (a > b) {
            bw.write(">");
        } else if (a < b) {
            bw.write("<");
        } else {
            bw.write("==");
        }

        bw.close();
    }
}
