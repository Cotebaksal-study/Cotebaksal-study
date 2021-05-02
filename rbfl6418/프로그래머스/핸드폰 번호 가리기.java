class Solution {
    public String solution(String phone_number) {
        String[] sArr = phone_number.split("");
        int sLength = sArr.length;
        
        String answer = "";
        for(int i = 0; i < sLength-4; i++){
            answer += "*";
        }
        for(int i = sLength-4 ; i < sLength; i++){
            answer += sArr[i];
        }
        return answer;
    }
}
