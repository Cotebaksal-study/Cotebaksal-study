import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        // 제한사항 
        if(n>1000000000)
            System.out.println("유효한 값을 입력하세요");
        
        while(n!=0) {
            answer += n%10;
            n = n/10;
        }

        return answer;
    }
}
