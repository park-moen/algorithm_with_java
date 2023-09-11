package com.algorithm.baekjoon.문자열;

import java.io.*;

public class n_1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] words = reader.readLine().trim().split(" ");

        if (words[0].isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(words.length);
        }
    }
}
