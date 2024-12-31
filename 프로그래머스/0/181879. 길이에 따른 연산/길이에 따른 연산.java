class Solution {
    public static int solution(int[] num_list) {
        int answer = 1;

        if (num_list.length >= 11) {
            answer = 0; 
            for (int num : num_list) {
                answer += num; 
            }
        } else {
            for (int num : num_list) {
                answer *= num; 
            }
        }

        return answer;
    }
}

// import java.util.*;

// class Solution {
//     public int solution(int[] numList) {
//         return numList.length < 11 ? Arrays.stream(numList).reduce(1, (acc, x) -> acc * x) : Arrays.stream(numList).sum();
//     }
// }