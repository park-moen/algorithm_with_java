package com.algorithm.baekjoon.조건문;

import java.io.*;
import java.util.*;

public class n_2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");

        firstSolution(input);
        System.out.println();
        secondSolution(input);
    }

    private static void firstSolution(String[] input) {
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

        if (a == b && b == c) {
            System.out.println(10000 + (a * 1000));
        } else if (a == b || b == c) {
            System.out.println(1000 + (b * 100));
        } else if (a == c) {
            System.out.println(1000 + (c * 100));
        } else {
            System.out.println(100 * Math.max(a, Math.max(b, c)));
        }
    }

    private static void secondSolution(String[] input) {
        TreeMap<Integer, Integer> hash = new TreeMap<>();

        Arrays.stream(input).forEach(value -> {
            int key = Integer.parseInt(value);
            hash.put(key, hash.getOrDefault(key, 0) + 1);
        });


        switch (hash.size()) {
            case 3 -> System.out.println(hash.lastKey() * 100);
            case 2 -> hash.forEach((key, value) -> {
                if (value == 2) {
                    System.out.println(1000 + (key * 100));
                }
            });
            case 1 -> System.out.println(10000 + (hash.firstKey() * 1000));
        }
    }
}
