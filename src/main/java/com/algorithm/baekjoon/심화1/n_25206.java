package com.algorithm.baekjoon.심화1;

import java.io.*;

public class n_25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double sumOfGrade = 0;
        double sumOfScore = 0;

        for (int i = 0; i < 20; i++) {
            String[] input = reader.readLine().split(" ");
            double score = Double.parseDouble(input[1]);
            String rating = input[2];

            if (!rating.equals("P")) {
                sumOfGrade += gradeCalculator(rating, score);
                sumOfScore += score;
            }
        }

        System.out.printf("%.6f", sumOfGrade / sumOfScore);
    }

    private static double gradeCalculator(String rating, double score) {
        double result = 0;

        switch (rating) {
            case "A+" -> result += score * 4.5;
            case "A0" -> result += score * 4.0;
            case "B+" -> result += score * 3.5;
            case "B0" -> result += score * 3.0;
            case "C+" -> result += score * 2.5;
            case "C0" -> result += score * 2.0;
            case "D+" -> result += score * 1.5;
            case "D0" -> result += score * 1.0;
            case "F" -> result += score * 0;
        }

        return result;
    }
}

