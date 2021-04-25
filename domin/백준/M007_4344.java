import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {

        public static void main(String[] args) throws Exception{
              
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            // 테스트 케이스 개수를 세는 c
            int c = Integer.parseInt(br.readLine());
            // 결과값 초기화
            double result = 0;
            
            for(int i = 0 ; i < c ; i++){
                // c번째 행
                
                // 합계
                int sum = 0;
                String st = br.readLine();
                // 받은수 (9 10 20 30 40 50 60 70 80 90)
                String[] arr = st.split(" ");
                int n = Integer.parseInt(arr[0]);
                for(int z = 1; z <= n; z++){
                    int grade = Integer.parseInt(arr[z]);
                    sum+= grade;
                }
                double avg = sum / n;
                
                // 평균이 넘는 학생의 수
                double count = 0;
                for(int j = 1; j <= n; j++) {
                    int grade = Integer.parseInt(arr[j]);
                    if(grade > avg) {
                        count++;
                    }
                }
                
                // 학생수 9명중 평균이상의 학생은 5명이다.
                result =  Math.round(((count / n) * 100) * (double)1000.0)/1000.0;
                DecimalFormat form = new DecimalFormat("0.000");
                System.out.println(form.format(result) + "%");

            }
            br.close();

        }
}
