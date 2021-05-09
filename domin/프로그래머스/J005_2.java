//[자연수 뒤집어 배열]
import java.util.*;

class Solution {
    public int[] solution(long n) {
        String str = n+"";
        char[] cArr = new char[str.length()];
        int[] answer = new int[str.length()];
        
        StringBuilder sb = new StringBuilder(n+"");
        cArr = sb.reverse().toString().toCharArray();
        for(int i = 0;i< cArr.length; i++){
            answer[i] = Integer.parseInt(cArr[i]+"");
        }
        
        return answer;
        
     
        
    }
}
