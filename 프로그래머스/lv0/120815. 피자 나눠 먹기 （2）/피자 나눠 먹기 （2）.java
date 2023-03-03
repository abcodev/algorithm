class Solution {
    public int solution(int n) {
        int answer = 0;  
        if(n%6==0){
            answer = n/6;
        }else if(n%2==0){
            answer = n*3/6;
        }else if(n%3==0){
            answer = n*2/6;
        }else{
            answer = n;
        }         
        return answer;
    }
    
    
//     public int GCD(int num1, int num2) {
//         if (num1 % num2 == 0)
//             return num2;
//         return GCD(num2, num1 % num2);
//     }

//     public int LCM(int num1, int num2) {
//         return num1 * num2 / GCD(num1, num2);
//     }

//     public int solution(int n) {
//         return LCM(n, 6) / 6;
//     }
    
}