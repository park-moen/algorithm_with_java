package com.algorithm.baekjoon.기하학직사각형과삼각형;

import java.io.*;
import java.util.HashSet;

public class n_10101 {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static final int TOTAL = 180;

    public static void main(String[] args) throws IOException {
        int A = Integer.parseInt(reader.readLine());
        int B = Integer.parseInt(reader.readLine());
        int C = Integer.parseInt(reader.readLine());

        if (A + B + C != TOTAL) {
            System.out.println("Error");
            return;
        }

        HashSet<Integer> hash = new HashSet<>();

        hash.add(A);
        hash.add(B);
        hash.add(C);

        if (hash.size() == 3) {
            System.out.println("Scalene");
        }

        if (hash.size() == 2) {
            System.out.println("Isosceles");
        }

        if (hash.size() == 1) {
            System.out.println("Equilateral");
        }
    }
}
