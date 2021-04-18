class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        //a b가 같은 경우
        if(a == b){
            return a;    
        //a b가 다른 경우
        } else if(a < b){
            int num = (b-a)+1;
            for(int i=0; i < num; i++){
                answer += a;
                a++;
            }
             return answer;
        }else{
            int num = (a-b)+1;
            for(int i=0; i < num; i++){
                answer += b;
                b++;
            }
            return answer;
       }
    }
}
