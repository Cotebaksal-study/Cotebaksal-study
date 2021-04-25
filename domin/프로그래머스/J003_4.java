import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        return test(arr);
    }
    
    public int[] test(int[] arr){
        ArrayList aList = new ArrayList<>();
        // 0 부터 9까지 숫자
        // 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거
        // 1,1,3,3,0,1,1 -> 1,3,0,1 (중복제거가 아님!)
        // 그 다음 숫자가 현재숫자와 동일한지 배열의 마지막-1자리까지 확인, 다를때만 넣어줌
        // 동일한 수 맨마지막번째가 add됨.
        // input받은 배열의 마지막는 어쨋던 들어가게되어있음.
        for(int i = 0; i < arr.length-1; i++){
            System.out.print(arr[i] + "\t" + arr[i+1]);
            if(arr[i] != arr[i+1]){
                aList.add(arr[i]);
                System.out.print("\t 들어가는 숫자=>" + arr[i]);
            }
            System.out.println();
        }
        
        aList.add(arr[arr.length-1]);
         System.out.print("\t\t 들어가는 숫자=>" + arr[arr.length-1]);
        
        int[] answer = new int[aList.size()];
        for(int i =0; i< aList.size(); i++){
            answer[i] = (int)aList.get(i);
        }

        return answer;
        }
    }
