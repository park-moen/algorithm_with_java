package com.algorithm.baekjoon.약수배수와소수;

import java.io.*;
import java.util.*;

public class n_9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        while (true) {
            int input = Integer.parseInt(reader.readLine());
            int sum = 0;
            List<Integer> arr = new ArrayList<>();

            if (input == -1) {
                break;
            }

            for (int i = 1; i < input; i++) {
                if (input % i == 0) {
                    sum += i;
                    arr.add(i);
                }
            }

            if (sum == input) {
                result.append(input).append(" = ");

                for (int i = 0; i < arr.size(); i++) {
                    if ((arr.size() - 1) == i) {
                        result.append(arr.get(i));
                    } else {
                        result.append(arr.get(i)).append(" + ");
                    }
                }

                result.append("\n");
            } else {
                result.append(input).append(" ").append("is NOT perfect.").append("\n");
            }
        }

        System.out.println(result);
    }
}
