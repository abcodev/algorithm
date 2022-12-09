package src.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Basic {

    public void Baekjoon1546() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] score = Arrays.stream(br.readLine().split(" ")).mapToInt(i -> Integer.parseInt(i)).toArray();
        int max = Arrays.stream(score).max().getAsInt();

        double[] prints = new double[N];
        for(int i = 0; i < N; i++) {
            prints[i] =  (double)score[i] / max * 100;
        }
        System.out.println(Arrays.stream(prints).average().getAsDouble());

    }
}
