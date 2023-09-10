package com.algorithm.baekjoon._1차원배열;

import java.io.*;

public class n_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        int[] intArray = new int[2];

        for (int i = 1; i <= 9; i++) {
            int value = Integer.parseInt(reader.readLine());

            if (intArray[1] < value) {
                intArray[0] = i;
                intArray[1] = value;
            }
        }

        stringBuilder.append(intArray[1]).append("\n").append(intArray[0]);
        System.out.println(stringBuilder);
    }
}
