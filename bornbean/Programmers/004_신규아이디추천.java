class Solution {
    public String solution(String new_id) {
        String answer = new_id;
        StringBuilder sb = new StringBuilder("");
        char now;
        char past;
        
        // 1단계
        answer = answer.toLowerCase();
        
        // 2단계
        for (int i=0; i<answer.length(); i++) {
            now = answer.charAt(i);
            if(now == '-' || now == '_' || now == '.' || (now<='z'&& now>='a') || (now<='9'&&now>='1'))
                sb.append(now);
        }
        answer = sb.toString();
        
        // 3단계
        sb.setLength(0);
        sb.append(answer.charAt(0));
        for (int i=1; i<answer.length(); i++) {
            past = answer.charAt(i-1);
            now = answer.charAt(i);
            if(now=='.' && past=='.') {}
            else
                sb.append(now);
        }
        answer = sb.toString();
        
        // 4단계
        if(answer.startsWith("."))
            answer = answer.substring(1);
        if(answer.endsWith("."))
            answer = answer.substring(0,answer.length()-1);
        
        // 5단계
        if(answer.isEmpty())
            answer = "a";
        
        // 6단계
        if(answer.length() >= 16)
            answer = answer.substring(0,15);
        if(answer.endsWith("."))
            answer = answer.substring(0,answer.length()-1);
        
          // 7단계
        if(answer.length() <3) {
            char ch = answer.charAt(answer.length()-1);
            for(int i=0; i<=(3-answer.length()); i++) {
                System.out.println("+");
                answer += ch;
            }
        }
        return answer;
    }
}
