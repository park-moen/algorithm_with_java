package com.algorithm.baekjoon._1차원배열;

import java.io.*;
import java.util.*;

public class n_3052 {
    public static void main(String[] args) throws IOException {
        firstSolution();
    }

    private static void firstSolution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> hashSet = new HashSet<>();

        final int STATIC_NUMBER = 42;

        while (true) {
            String input = reader.readLine();

            if (input == null) {
                break;
            }

            hashSet.add(Integer.parseInt(input) % STATIC_NUMBER);
        }

        System.out.println(hashSet.size());
    }
}
