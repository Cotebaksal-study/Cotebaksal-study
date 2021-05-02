class Solution {
    public String solution(String s) {
        String[] sArr = s.split("");
        int sLength = sArr.length;
        String answer = "";
        
        if(sLength % 2 == 0){
            answer = sArr[(sLength/2)-1] + sArr[sLength/2];
            return answer;
        }else{
            answer = sArr[(sLength)/2];
        }
        return answer;
    }
}
