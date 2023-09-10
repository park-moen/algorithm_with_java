package com.algorithm.baekjoon._1차원배열;

import java.io.*;
import java.util.*;

public class n_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        reader.readLine();

        String[] input = reader.readLine().split(" ");
        final int target = Integer.parseInt(reader.readLine());

        long result = Arrays.stream(input)
                .map(Integer::parseInt)
                .filter(value -> value == target)
                .count();

        System.out.println(result);
    }
}
