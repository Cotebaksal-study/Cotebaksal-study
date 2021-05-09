class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        
        String s = String.valueOf(n);
        answer = new int[s.length()];
        for (int i=0; i<s.length(); i++) {
            answer[i] = (int)(n%10);
            n = n/10;
        }
        
        return answer;
    }
}
