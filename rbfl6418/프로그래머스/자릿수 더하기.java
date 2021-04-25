import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        //자연수N을 String배열로 변경한 후 
        //각 값을 int로 바꿔 더하기
        String sN = n + "";
        String[] s = sN.split("");
        for(int i = 0; i < s.length; i++){
            answer += Integer.parseInt(s[i]);
        }

        return answer;
    }
}
