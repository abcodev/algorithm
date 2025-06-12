class Solution {
    public int solution(int n) {
        return Math.sqrt(n) % 1 == 0 ? 1 : 2;

        // double sqrt = Math.sqrt(n);
        // if (sqrt == (int) sqrt) {
        //     return 1; 
        // } else {
        //     return 2; 
        // }
    }
}