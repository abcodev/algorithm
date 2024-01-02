import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int max = 0;
        int n = 0;

        for(int i =0; i<9; i++) {
            int num = Integer.parseInt(br.readLine());

            if(max < num) {
                max = num;

                n = i+1;
            }
        }

        System.out.println(max);
        System.out.println(n);

    }
}
