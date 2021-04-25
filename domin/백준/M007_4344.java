import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                    
        // 테스트 케이스 개수를 세는 c
        int c = Integer.parseInt(br.readLine());
                    
        for(int i = 0 ; i < c ; i++){
            int sum = 0;
            int count = 0; 
            double avg = 0;
         
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()); // 전체 학생 수
            int[] arr = new int[n];                
         
            // 1. 성적 총 합계(sum)
            for(int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                sum += arr[j];
            }
            
            // 1-1. 평균
            avg = sum / n;
         
            // 2. 평균초과하는 학생 수(count)
            for(int k = 0; k < n; k++) {
                if(arr[k] > avg) {
                    count++;
                }
            }
            System.out.printf("%.3f%%\n", (double)count / n * 100);
        }
        br.close();
    }
}
