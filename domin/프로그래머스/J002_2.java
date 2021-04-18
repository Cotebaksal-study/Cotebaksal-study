class Solution {
    public String solution(int n) {
        String answer = "";
        // n%2 == 1 수
        // n%2 == 0 박
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++){
            if(i%2 == 1){
                sb.append("수");
            }else if(i%2 == 0){
                sb.append("박");   
            }
        }
        return sb.toString();
    }
}
