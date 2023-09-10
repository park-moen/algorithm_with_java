package com.algorithm.baekjoon._1차원배열;

import java.io.*;
import java.util.*;

public class n_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        reader.readLine();

        String[] input = reader.readLine().split(" ");

        int maxScore = Arrays.stream(input).mapToInt(Integer::parseInt).max().orElse(-1);
        double transformScore = Arrays.stream(input).mapToDouble(value -> (Double.parseDouble(value) / maxScore) * 100).average().orElse(0);

        System.out.println(transformScore);

    }
}
