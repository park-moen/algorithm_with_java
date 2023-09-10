package com.algorithm.baekjoon._1차원배열;

import java.io.*;
import java.util.*;

public class n_10818 {
    public static void main(String[] args) throws IOException {
//        firstSolution();
        secondSolution();
    }

    // sorted 함수가 많은 리소스를 잡아먹는다.
    private static void firstSolution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        reader.readLine();

        int[] input = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();

        System.out.println(input[0] + " " + input[input.length - 1]);
    }

    private static void secondSolution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        reader.readLine();

        int[] input = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int min = Arrays.stream(input).min().orElse(-1);
        int max = Arrays.stream(input).max().orElse(-1);

        System.out.println(min + " " + max);
    }

    private static void thirdSolution() throws IOException {

    }
}
