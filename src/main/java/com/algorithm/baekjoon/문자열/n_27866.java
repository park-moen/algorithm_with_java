package com.algorithm.baekjoon.문자열;

import java.io.*;

public class n_27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String word = reader.readLine();
        int index = Integer.parseInt(reader.readLine());

        System.out.println(word.charAt(index - 1));
    }
}
