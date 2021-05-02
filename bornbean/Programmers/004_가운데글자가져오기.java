class Solution {
    public String solution(String s) {
        String answer = "";
        int length = s.length();
        
        if(length%2==0) { // 길이가 짝수인 경우
            answer = s.substring(length/2-1,length/2+1);
        } else { // 길이가 홀수인 경우
            answer = s.substring(length/2, length/2+1);
        }
        return answer;
    }
}
