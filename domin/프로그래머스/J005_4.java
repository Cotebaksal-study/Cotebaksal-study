//[하샤드 수]
class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int n = x;
        int result = 0;
        while(n > 0){
            result += n % 10;    
            n = n / 10;
        }
        
        return (x % result == 0) ? true : false;
    }
}
