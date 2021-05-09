class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        // 자릿수의 합을 담는 변수
        int sum=0;
        int temp=x;
        
        while(temp>0) {
            sum = sum + temp%10;
            temp = temp/10;
        }
        
        if(x%sum!=0)
            answer = false;
        
        return answer;
    }
}
