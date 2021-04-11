import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        String time = br.readLine();
        String[] sArr = new String[2];
        sArr = time.split(" ");
        
        int hour = Integer.parseInt(sArr[0]);
        int min = Integer.parseInt(sArr[1]);
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        if(hour >= 0 && hour <= 23 && min >= 0 && min <= 59) {
            // 45분전 시간 구하는 식
            if(min - 45 < 0 ) { 
                min = 60 - (45 - min);
                if(hour == 0){
                    hour = 24;
                }
                hour = hour - 1;
            }else{
                min = min - 45;
            }
            // 결과값 출력
            String result =hour+" "+ min; 
            bw.write(result);
        }else {
            throw new Exception("올바른 형식이 아닙니다.");
        }
        
        bw.flush();
        bw.close();
        
    }
}
