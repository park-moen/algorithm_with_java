package com.algorithm.baekjoon.심화1;

import java.io.*;

public class n_1316 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (check(reader.readLine())) {
                count++;
            }
        }

        System.out.println(count);
    }

    private static boolean check(String input) {
        boolean[] alphabet = new boolean[26];
        int next = 0;

        for (int i = 0; i < input.length(); i++) {
            int current = input.charAt(i);

            if (next != current) {
                if (alphabet[current - 'a']) {
                    return false;
                } else {
                    alphabet[current - 'a'] = true;
                    next = current;
                }
            }
        }

        return true;
    }
}
