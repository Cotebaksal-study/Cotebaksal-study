class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if (s.length() == 4 || s.length() == 6) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) < 48 || 57 < s.charAt(i)) {
                    answer = false;
                    return answer;
                }
            }
        } 
        else answer = false;
        return answer;
    }
}
