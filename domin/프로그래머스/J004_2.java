//2. 핸드폰 번호 가리기
class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        // 뒤 네자리를 제외한 나머지 숫자를 *로
        // 01012345678   6 10 length -> 11
        int length = phone_number.length();
        for(int i = 0; i < length; i++){
            if(i < length - 4){
                answer += "*";
            }else{
                answer += phone_number.charAt(i)+"";    
            }
        }
        
        return answer;
    }
}
