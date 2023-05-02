class Solution {
    // public int solution(int n, int k) {
    //     int answer = 12000 * n + (k - (n/10))*2000;
    //     return answer;
    // }
    
    public int solution(int n, int k) {
        return n * 12000 + k * 2000 - (n / 10 * 2000);
    }
}