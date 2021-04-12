 public boolean solution(String s) {
         boolean answer = true;
            if(s.length() == 4 || s.length() == 6){
                try {
                    Integer.parseInt(s);
                    
                } catch (Exception e) {
                    answer = false;
                    return answer;
                }
                return answer;
            }else{
                answer = false;
                return answer;
            }
   }
