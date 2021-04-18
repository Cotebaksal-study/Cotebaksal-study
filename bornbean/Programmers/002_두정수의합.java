class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        // 중간 숫자를 구하기 위해 대소관계를 설정할 변수 max min 
        // default 값을 max = a; min = b; 로 두고 아닌 경우 다시 대입
        int max = a;
        int min = b;
        
        if (a < b) {
            max = b;
            min = a;
        }
        
        for (int i=min; i<=max; i++) {
            answer = answer + i;
        }
        
        return answer;
    }
}
