package com.algorithm.baekjoon.일반수학1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * O10 36 <- N진수를 10진수로
 * 31140 36 <- 10진수를 N진수
 */

public class n_11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);

//        firstSolution(N, B);
//        secondSolution(N, B);
        thirdSolution(N, B);
    }

    private static void firstSolution(int N, int B) {
        StringBuilder result = new StringBuilder();

        while (N > 0) {
            int remainder = N % B;

            if (remainder >= 10) {
                result.append((char) (remainder + 55));

            } else {
                result.append(remainder);
            }

            N /= B;
        }

        System.out.println(result.reverse());
    }

    private static void secondSolution(int N, int B) {
        List<Character> list = new ArrayList<>();

        while (N != 0) {
            int remainder = N % B;

            if (remainder >= 10) {
                list.add((char) (remainder + 55));
            } else {
                list.add((char)(remainder + 48));
            }

            N /= B;
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i));
        }
    }

    private static void thirdSolution(int N, int B) {
        System.out.println(Integer.toString(N, B).toUpperCase());
    }
}
