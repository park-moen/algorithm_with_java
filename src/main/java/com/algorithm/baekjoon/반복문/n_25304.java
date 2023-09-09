package com.algorithm.baekjoon.반복문;

import java.io.*;

public class n_25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int totalPrice = Integer.parseInt(reader.readLine());
        int len = Integer.parseInt(reader.readLine());
        int sum = 0;

        for (int i = 0; i < len; i++) {
            String[] input = reader.readLine().split(" ");

            int price = Integer.parseInt(input[0]);
            int count = Integer.parseInt(input[1]);

            sum += (price * count);
        }

        System.out.println(totalPrice == sum ? "Yes" : "No");
    }
}
