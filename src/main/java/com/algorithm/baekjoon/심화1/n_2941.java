package com.algorithm.baekjoon.심화1;

import java.io.*;

public class n_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] croatiaLanguage = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        String word = reader.readLine();

        for (String alphabet : croatiaLanguage) {
            if (word.contains(alphabet)) {
                word = word.replaceAll(alphabet, "0");
            }
        }

        System.out.print(word.length());
    }
}
