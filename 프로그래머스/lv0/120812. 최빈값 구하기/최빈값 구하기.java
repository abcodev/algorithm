import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] array) {
        int maxCount = 0;
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int number : array){
            int count = map.getOrDefault(number, 0) + 1;
            if(count > maxCount){
                maxCount = count;
                answer = number;
            }
            else  if(count == maxCount){
                answer = -1;
            }
            map.put(number, count);
        }
        return answer;
    }
}

// import java.util.Arrays;

// class Solution {
//     public int solution(int[] array) {
                
//         Arrays.sort(array);
        
//         int answer = 0;
//         int max = array[array.length - 1]; 
//         int count[] = new int[max + 1];
        
//         for(int i = 0; i < array.length; i++) {
//             count[array[i]]++; 
//         }
        
//         max = count[0];
        
//         for(int i = 1; i < count.length; i++) {
//             if(max < count[i]) {
//                 max = count[i];
//                 answer = i; 
//             }else if(max == count[i]) {
//                 answer = -1;
//             }
//         }
//         return answer; 
//     }
// }