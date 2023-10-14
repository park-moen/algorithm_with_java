package com.algorithm.baekjoon.약수배수와소수;

import java.io.*;

public class n_5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        
        while (true) {
            String[] input = reader.readLine().split(" ");

            int first = Integer.parseInt(input[0]);
            int last = Integer.parseInt(input[1]);

            if (first == 0 && last == 0) {
                break;
            }

            if (last % first == 0) {
                result.append("factor");
            } else if (first % last == 0) {
                result.append("multiple");
            } else {
                result.append("neither");
            }

            result.append("\n");
        }

        System.out.println(result);
    }
}
