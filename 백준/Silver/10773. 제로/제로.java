import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        long sum = 0;

        for (int i = 0; i < K; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                int removed = stack.pop();
                sum -= removed;
            } else {
                stack.push(num);
                sum += num;
            }
        }

        System.out.println(sum);
    }
}
