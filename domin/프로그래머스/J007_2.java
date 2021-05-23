//[약수개수 덧셈]
class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i = left; i <= right; i++){
            // 각 약수개수
            int cnt = 0;
            for(int j = 1; j <= i; j++ ){
                if(i % j ==0){
                    cnt++;
                }
            }
            if(cnt % 2 == 0)    answer += i;
            else                answer -= i;
            
            
        }
        
        return answer;
    }
}
