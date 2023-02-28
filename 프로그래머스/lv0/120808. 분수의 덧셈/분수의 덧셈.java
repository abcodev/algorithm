class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int x = numer1*denom2 + numer2*denom1;
        int y = denom1*denom2;
        
        int num =0;
        
        for(int i=1; i <= x && i <= y; i++) {         
            if(x%i == 0 && y%i == 0){
                num = i;
            }            
        }
        
        
        if(x % num == 0){
            if(y % num == 0){
                y = y / num;
            }
            x = x / num;
        }
        
        int[] answer = {x, y};
        return answer;
    }
}