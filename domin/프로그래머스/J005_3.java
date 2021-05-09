//[x만큼 간격이 있는 n개의 숫자]
class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        // 2 + 2*0 = 2
        // 2 + 2*1 = 4
        // 2 + 2*2 = 6
        //     ..
        // 2 + 2*4  = 10
            
        for(int i = 0; i < n; i++){
            answer[i] = x + (x * (long)i); // 테케13,14 에러.. long으로 형변환하니 통과됨.(???)
        }
        
        return answer;
    }
}
