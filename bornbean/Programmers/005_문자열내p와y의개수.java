class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int countP = 0;
        int countY = 0;
        char now = ' ';
        
        for (int i=0; i<s.length(); i++) {
            now = s.charAt(i);
            if(now == 'P' || now == 'p')
                countP++;
            else if (now == 'Y' || now == 'y')
                countY++;
        }
        
        if(countP!=countY)
            answer = false;

        return answer;
    }
}
