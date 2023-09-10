package com.algorithm.baekjoon._1차원배열;

import java.io.*;
import java.util.*;

public class n_5597 {
    public static void main(String[] args) throws IOException {
//        firstSolution();
        secondSolution();
    }

    private static void firstSolution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        final int NUMBER_OF_SUBMIT = 28;
        final int NUMBER_OF_ALL_STUDENT = 30;

        List<Integer> submitList = new ArrayList<>();
        List<Integer> unSubmitList = new ArrayList<>();

        for (int i = 0; i < NUMBER_OF_SUBMIT; i++) {
            submitList.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 1; i <= NUMBER_OF_ALL_STUDENT; i++) {
            if (!submitList.contains(i)) {
                unSubmitList.add(i);
            }
        }

        System.out.println(unSubmitList.get(0) + "\n" + unSubmitList.get(1));
    }

    private static void secondSolution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] students = new int[31];

        for (int i = 1; i <= 30; i++) {
            students[i] = i;
        }

        for (int i = 0; i < 28; i++) {
            students[Integer.parseInt(reader.readLine())] = 0;
        }

        for (int i = 1; i <= 30; i++) {
            if (students[i] != 0) {
                System.out.println(students[i]);
            }
        }
    }
}
