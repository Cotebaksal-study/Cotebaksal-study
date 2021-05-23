import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        
        //arraylist에 담기
        ArrayList<Integer> answer = new ArrayList<>(arr.length);
        for (int i : arr ) {
            answer.add(i);
        }
        
        //빈 배열인 경우 -1 채우기
        if(arr.length <= 1) { 
            answer.clear(); 
            answer.add(-1);
            return answer;  
        }
        
        int min = arr[0];
        int index = 0;
        
        //가장 작은 수의 index 알아내기
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        

        //가장 작은 수 제거
        answer.remove(index);
        
        return answer;
    }
}
