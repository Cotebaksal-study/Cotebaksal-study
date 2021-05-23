//[로또 최고순위 최저순위] 
import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0,0};
        
        // 1.정렬
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        
        // lottos중에 winNum이랑 맞는게 있는지 체크
        // lottos중에 몇개나 지워졌는지 체크
        int cnt = 0;
        int zeroCnt = 0;
        
        for(int i = 0 ;i < 6; i++){
            if(lottos[i] == 0){
                zeroCnt++;
                continue;
            }
            
            // 0부터 5까지 전체돌려야 테케11 에러안남
            for(int j = 0; j < 6; j++){
               if(lottos[i] == win_nums[j]){
                     cnt++;
                     break;
                }
            }            
        }
        
        answer[0] = zeroCnt+cnt >= 2 ? (7 - (zeroCnt+cnt)) : 6;
        answer[1] = cnt >= 2 ? 7 - cnt : 6;
        
        return answer;
    }
}
