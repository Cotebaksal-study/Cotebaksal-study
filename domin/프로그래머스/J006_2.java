//[최대공약수 최대공배수]
import java.util.*;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max = m > n ? m : n;
        int min = m > n ? n : m;
        
        answer[0] = 1; // 최대공약수 :  
        answer[1] = 1; // 최소공배수 : answer[1]
        
        // 유클리드 호제법
        // max를 min을 나눈 나머지값 R
        // max와 m의 최대공약수는 y와 r의 최대공약수
        int tmp = 0;
        while(true){
            tmp = max % min;
                
            if(tmp == 0){
                answer[0] = min;
                 break;
            }else{
                max = min;
                min = tmp;
            }
        }
        // 최소공배수 = 두 자연수의 곱 / 최대공역수
        answer[1] = (m * n ) / answer[0];
        
        
        return answer;
    }
}
