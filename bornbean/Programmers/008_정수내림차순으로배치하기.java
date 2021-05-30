import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        StringBuilder sb = new StringBuilder("");
        int length = String.valueOf(n).length();
        long num[] = new long[length];
        
        for(int i=0; i<length; i++) {
            num[i] = n%10;
            n /= 10;
        }
        long temp;
        for(int i=0; i<length; i++) {
            for (int j=i+1; j<length; j++) {
                if(num[i]<num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        for(int i=0; i<length; i++) {
            sb.append(num[i]);
        }
        answer = Long.parseLong(sb.toString());
        return answer;
    }
}
