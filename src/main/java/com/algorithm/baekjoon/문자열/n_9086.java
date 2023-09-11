package com.algorithm.baekjoon.문자열;

import java.io.*;

public class n_9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        int N = Integer.parseInt(reader.readLine());

        for (int i = 0; i < N; i++) {
            String word = reader.readLine();

            char firstChar = word.charAt(0);
            char lastChar = word.charAt(word.length() - 1);

            result.append(firstChar).append(lastChar).append("\n");
        }

        System.out.println(result);
    }
}
