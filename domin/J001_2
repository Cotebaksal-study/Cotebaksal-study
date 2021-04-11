import java.util.*;

class Solution {
    // 프로그래머스 문자열다루기 기본
    public boolean solution(String s) {
        boolean result = false;
        
        // 문자열 길이 4 혹은 6
        if(s.length() == 4 || s.length() == 6){
            char cArr[] = new char[s.length()];
            cArr = s.toCharArray();
            
            for(int i = 0; i < s.length(); i++){
                int item = cArr[i];
                if(item >= 48 && item <= 57){
                    result = true;
                }else{
                    return false;
                } 
            }
        }
        
        return result;
    }
    
    
}
