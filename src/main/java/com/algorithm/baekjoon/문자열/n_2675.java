package com.algorithm.baekjoon.문자열;

import java.io.*;
import java.util.*;

public class n_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        int N = Integer.parseInt(reader.readLine());

        for (int i = 0; i < N; i++) {
            String[] input = reader.readLine().split(" ");

            int count = Integer.parseInt(input[0]);
            List<String> word = Arrays.asList(input[1].split(""));

            word.forEach(value -> result.append(value.repeat(count)));
            result.append("\n");
        }

        System.out.println(result);
    }
}
