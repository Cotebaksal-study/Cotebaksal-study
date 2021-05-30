class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
    
        // 여벌 체육복을 가져온 학생 중 체육복을 도난당한 학생 중복 제거
        for(int i=0; i<lost.length; i++) {
            for (int j=0; j<reserve.length; j++) {
                if(lost[i] == reserve[j]) {
                    lost[i] = 0;
                    reserve[j] = 0;
                }
            }
        }
        for(int i=0; i<lost.length; i++) {
            if(lost[i] != 0) {
                for(int j=0; j<reserve.length; j++) {
                    if(reserve[j] != 0) {
                        if(lost[i]!=1 && reserve[j] == lost[i]-1) {
                            lost[i] = 0;
                            reserve[j] = 0;
                        } else if (lost[i]!=n && reserve[j] == lost[i]+1) {
                            lost[i] = 0;
                            reserve[j] = 0;
                        }
                    }
                }
            }
        }
        for(int i=0; i<lost.length; i++) {
            if(lost[i]!=0)
                n--;
        }
        answer = n;
        return answer;
    }
}
