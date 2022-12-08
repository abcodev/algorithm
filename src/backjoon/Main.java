package src.backjoon;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int sArr[] = new int [31];

        for(int i =1; i<=28; i++) {
            sArr[Integer.parseInt(br.readLine())]++;
        }

        for (int i=1; i<=30; i++){
            if(sArr[i]==0) {
                System.out.println(i);
            }
        }

    }

}
