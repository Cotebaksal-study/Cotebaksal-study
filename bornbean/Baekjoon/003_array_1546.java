import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
      
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      
      // 과목수를 저장할 변수
      int subjectNum = Integer.parseInt(bf.readLine());
      // 최고점을 저장할 변수
      double max = 0;
      // 성적을 저장할 배열
      double[] score = new double[subjectNum];
      // 결과를 저장할 변수
      double result = 0;
      
      StringTokenizer st = new StringTokenizer(bf.readLine());
      for(int i=0; i<subjectNum; i++) {
        score[i] = Integer.parseInt(st.nextToken());
        if (score[i] > max) max=score[i];
      }
      for(int i=0; i<subjectNum; i++) {
        result = result + ((score[i]/max)*100);
      }
      result = result/subjectNum;
      System.out.println(result);
    }
}
