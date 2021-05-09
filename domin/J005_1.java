//[문자열 내 p와 y의 개수]
class Solution {
    boolean solution(String s) {
        String str = s.toUpperCase();;
        
        int pCount = 0;
        int yCount = 0;
        
        // System.out.println((int)'P' + "\t" + (int)'Y'); // P : 80, Y : 89
        for(int i = 0; i< str.length(); i++){
            if(str.charAt(i) == 80)    pCount++;
            if(str.charAt(i) == 89)    yCount++;
        }
        
        if(pCount == yCount){
            return true;
        }
        

        return false;
    }
}
