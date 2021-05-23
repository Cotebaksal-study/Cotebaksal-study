//[제일작은수 제거]
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        if(arr.length == 1){
            answer[0] = -1;
        }
        else{
            answer = new int[arr.length-1];
            int min = arr[0];
            for(int i = 0 ; i< arr.length; i++){
                if(min > arr[i]){  
                    min = arr[i];
                }
            }
            int idx= 0;
            for(int i = 0; i < arr.length; i++){
                if(min == arr[i]){
                    continue;
                }else{
                    answer[idx] = arr[i];
                    idx++;
                }
            }
            
        }
        return answer;
    }
}
