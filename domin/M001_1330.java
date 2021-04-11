import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        try{
            // 입력
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();        
            String[] sArr = s.split(" ");
            
            int first = Integer.parseInt(sArr[0]);
            int last = Integer.parseInt(sArr[1]);
            
            // 예외처리(범위)
            if(first > 10000 || first < -10000 || last > 10000 || last < -10000) {
                throw new Exception("범위에 맞지않습니다! -10000 에서 10000 사이 숫자를 입력해주세요.");
            }
            
            String result = (first>last)? ">" : (first<last)? "<" : "==";
            
            // 출력
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
                
            writer.write(result);            

            writer.flush();
            writer.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
