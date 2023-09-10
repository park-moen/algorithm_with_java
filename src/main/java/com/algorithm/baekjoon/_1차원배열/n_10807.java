package com.algorithm.baekjoon._1차원배열;

import java.io.*;
import java.util.stream.*;

public class n_10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] targetStringArray = reader.readLine().split(" ");
        String[] sequence = reader.readLine().split(" ");

        final int TARGET = Integer.parseInt(targetStringArray[1]);

        String result = Stream.of(sequence)
                .map(Integer::parseInt)
                .filter(value -> TARGET > value)
                .map(String::valueOf)
                .collect(Collectors.joining(" "));

        System.out.println(result);
    }
}
