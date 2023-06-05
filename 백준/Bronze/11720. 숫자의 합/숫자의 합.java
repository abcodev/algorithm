import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        char[] str = br.readLine().toCharArray();

        int total = 0;

        for (int i = 0 ; i < str.length ; i++) {

            String check = String.valueOf(str[i]);

            total  += Integer.valueOf(check) ;
        }

        bw.write(Integer.toString(total));
        bw.flush();
    }
}