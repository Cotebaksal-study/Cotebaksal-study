class Solution {
    public double solution(int[] arr) {
        double count = arr.length;
        double sum = 0;
        
        for(int i = 0; i <count; i++){
            sum += arr[i];
        }       
        return sum/count;
    }
}
