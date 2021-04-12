import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No5 {

    public static void main(String[] args) throws IOException {
        //두 정수 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] time = br.readLine().split(" ");

        int h = Integer.parseInt(time[0]);
        int m = Integer.parseInt(time[1]);
        
        if(m < 45) {
            if(h == 0) {
                h = 23;
                m = m + 15;
                System.out.println(h+" "+m);
            }else {
                h--;
                m = m + 15;
                System.out.println(h+" "+m);
            }
            return;
        }else if(m >= 45) {
            m = m - 45;
            System.out.println(h+" "+m);
        }
    }

}
