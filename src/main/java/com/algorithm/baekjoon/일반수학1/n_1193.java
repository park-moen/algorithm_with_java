package com.algorithm.baekjoon.일반수학1;

import java.io.*;

public class n_1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(reader.readLine());
        int line = 1;
        int count = 0;
        int deno;
        int numer;

        while (count < x) {
            count += line;
            line++;
        }

        if ((line - 1) % 2 == 0) {
            deno = 1 + (count - x);
            numer = (line - 1) - (count - x);
        } else {
            deno = (line - 1) - (count - x);
            numer = 1 + (count - x);
        }

        System.out.println(numer + "/" + deno);
    }
}
