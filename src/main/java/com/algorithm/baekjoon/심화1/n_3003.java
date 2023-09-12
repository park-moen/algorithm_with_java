package com.algorithm.baekjoon.심화1;

import java.io.*;
import java.util.*;

public class n_3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] input = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        firstSolution(input);
        secondSolution(input);
    }

    private static void firstSolution(int[] input) {
        int[] chessBoard = {1, 1, 2, 2, 2, 8};
        int[] incompleteBoard = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            if (input[i] < chessBoard[i]) {
                incompleteBoard[i] = (chessBoard[i] - input[i]);
            }

            if (input[i] > chessBoard[i]) {
                incompleteBoard[i] = (chessBoard[i] - input[i]);
            }
        }

        printValue(incompleteBoard);
    }

    private static void secondSolution(int[] input) {
        int[] chessBoard = {1, 1, 2, 2, 2, 8};

        for (int i = 0; i < input.length; i++) {
            chessBoard[i] -= input[i];
        }

        printValue(chessBoard);
    }

    static private void printValue(int[] array) {
        StringBuilder result = new StringBuilder();

        for (int value : array) {
            result.append(value).append(" ");
        }

        System.out.println(result);
    }
}
