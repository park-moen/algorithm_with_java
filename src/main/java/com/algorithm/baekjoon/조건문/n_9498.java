package com.algorithm.baekjoon.조건문;

import java.io.*;

public class n_9498 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        switch (a / 10) {
            case 10, 9 -> System.out.println('A');
            case 8-> System.out.println('B');
            case 7-> System.out.println('C');
            case 6-> System.out.println('D');
            default -> System.out.println('F');
        }
    }
}
