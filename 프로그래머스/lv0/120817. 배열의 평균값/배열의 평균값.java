import java.util.Arrays;

class Solution {
    public double solution(int[] numbers) {
//         double answer = 0;
//         double sum = 0;
        
//         for(int i = 0; i< numbers.length; i++) {
//             sum += numbers[i];
//         }
//         answer = (sum / numbers.length);      
//         return answer;
        
        return Arrays.stream(numbers).average().orElse(0);
        // .orElse(0) -> 주어진 값이 null이 아닌 경우 주어진 값을 되돌려주고 null인 경우 인수(0)을 돌려줌
    }
}