package com.algorithm.baekjoon.기하학직사각형과삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n_5073 {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringBuilder result = new StringBuilder();

        while (true) {
            String[] input = reader.readLine().split(" ");

            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);
            int C = Integer.parseInt(input[2]);

            if (breakPoint(A, B, C)) break;

            if (validation(A, B, C)) {
                result.append("Invalid").append("\n");
                continue;
            }

            if (isEquilateral(A, B, C)) {
                result.append("Equilateral").append("\n");
                continue;
            }

            if (isIsosceles(A, B, C)) {
                result.append("Isosceles").append("\n");
                continue;
            }

            if (isScalene(A, B, C)) {
                result.append("Scalene").append("\n");
            }
        }

        System.out.println(result);
    }

    private static boolean breakPoint(int A, int B, int C) {
        return A == 0 && B == 0 && C == 0;
    }

    private static boolean validation(int A, int B, int C) {
        if (A >= (B + C)) {
            return true;
        }

        if (B >= (A + C)) {
            return true;
        }

        if (C >= (A + B)) {
            return true;
        }

        return false;
    }

    private static boolean isEquilateral(int A, int B, int C) {
        return A == B && B == C;
    }

    private static boolean isIsosceles(int A, int B, int C) {
        return (A == B && B != C) || (A == C && C != B) || (B == C && C != A);
    }

    private static boolean isScalene(int A, int B, int C) {
        return A != B && B != C && A != C;
    }
}
