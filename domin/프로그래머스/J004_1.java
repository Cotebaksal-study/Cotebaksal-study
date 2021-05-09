//1. 가운데 글자 가져오기
class Solution {
    public String solution(String s) {
        String answer = "";
        
        if(s.length() <= 2){
            answer = s;
        }else{
            int middle = s.length() / 2;
            if(s.length() % 2 == 0){
                // index 0 1 2 3  -> len: 4, 1,2 반환
                answer = s.charAt(middle-1) + ""+ s.charAt(middle); 
                // answer = (String) s.charAt()
            }else{
                // index 0 1 2 3 4  -> len: 5, 2
                answer = s.charAt(middle) + "";
            }
        }
        return answer;
    }
}
