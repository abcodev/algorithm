import java.util.stream.IntStream;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        // 1번
        // int[] answer = {};
        // answer = new int[2];
        // for(int i=0; i<num_list.length; i++) {
        //     if(num_list[i]%2==0) {
        //         answer[0]++;
        //     }else {
        //         answer[1]++;
        //     }
        // }        
        // return answer;
        
        // 2번
        // int[] answer = new int[2];
        // for(int i = 0; i < num_list.length; i++)
        //     answer[num_list[i] % 2]++;
        // return answer;
        
        // 3번
        return IntStream.of((int) Arrays.stream(num_list).filter(i -> i % 2 == 0).count(), (int) Arrays.stream(num_list).filter(i -> i % 2 == 1).count()).toArray();

    }
}