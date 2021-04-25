import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        Arrays.sort(arr); // 정렬
        ArrayList aList = new ArrayList<>();
        
        // 나누어 떨어지는 값을 오름차순으로 정렬
        for(int i = 0; i < arr.length; i++){            
            if(arr[i] % divisor == 0 || arr[i] % divisor == divisor){
                aList.add(arr[i]);
            }
        }
        
        if(aList.isEmpty()){
            aList.add(-1);
        }
        
        arr = new int[aList.size()];
        
        for(int i = 0 ; i < aList.size(); i++){
            arr[i] = (int)aList.get(i);
        }
        return arr;
    }   
}
