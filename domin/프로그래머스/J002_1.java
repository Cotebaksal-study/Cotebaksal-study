class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a >= -10000000 && a <= 10000000 && b >= -10000000 && b <= 10000000){
            int min = a;
            int max = b;

            if(a > b){
                min = b;
                max = a;
            }
        
            for(int i = min; i <= max; i++){
                answer += i;
            }
        }
        return answer;
    }
}
