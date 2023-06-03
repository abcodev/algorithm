

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
//        첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
//        둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다.
//        점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int C = Integer.parseInt(br.readLine());
//
//        for(int i = 0 ; i < C; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine()," ");
//            int N = Integer.parseInt(st.nextToken());
//            int [] arr = new int[N];
//            double sum = 0;
//
//            for(int j = 0 ; j < N ; j++) {
//                int score = Integer.parseInt(st.nextToken());
//                arr[j] = score;
//                sum += score;
//            }
//
//            double stu = (sum / N) ;
//            double count = 0;
//
//            for(int j = 0 ; j < N ; j++) {
//                if(arr[j] > stu) {
//                    count++;
//                }
//            }
//            System.out.printf("%.3f%%",(count/N)*100);
//        }
//    }

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int tmp = 0;
//        int array[];
//
//        int C = Integer.parseInt(br.readLine());
//
//        StringTokenizer st;
//
//        for(int i = 0 ; i < C ; i++) {
//            st = new StringTokenizer(br.readLine()," ");
//            tmp = Integer.parseInt(st.nextToken());
//            array = new int[tmp];
//
//            double sum = 0;
//            for(int j = 0; j < tmp ; j ++) {
//                array[j] = Integer.parseInt(st.nextToken());
//                sum += array[j];
//            }
//            double avg = 0;
//            avg = sum / tmp;
//
//            double cnt = 0;
//            for(int n = 0 ; n < tmp  ; n++) {
//                if(avg < array[n]) {
//                    cnt++;
//                }
//            }
//            System.out.printf("%.3f%%\n",((cnt/tmp)*100));
//        }

        Scanner sc = new Scanner(System.in);
        int [] number = new int[sc.nextInt()];

        for (int i=0; i<number.length; i++) {
            int [] student = new int[sc.nextInt()];
            double sum=0;
            double avg =0.0;
            double count =0.0;

            for (int j=0; j<student.length;j++) {
                student[j]=sc.nextInt();
                sum+= student[j];
            }
            avg = sum / (double)student.length;

            for (int a=0; a<student.length; a++) {
                if(avg<student[a]) {
                    count++;
                }
            }
            System.out.printf("%.3f%%\n",(double)(count/student.length)*100);
        }


    }

}


