import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
      
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      
      // 반복할 경우의 수
      int num = Integer.parseInt(bf.readLine());
      
      for (int k=0; k<num; k++) {

          // 입력
          StringTokenizer st = new StringTokenizer(bf.readLine());
          
          // 반복 횟수
          int rep = Integer.parseInt(st.nextToken());
          
          // 입력받은 문자열
          String str = st.nextToken();
          
          // 반복할 문자
          char ch=' ';
          
          // 결과값을 담을 stringbuilder 객체
          StringBuilder sb = new StringBuilder();
          
          for(int i=0; i<str.length(); i++) {
        	  ch = str.charAt(i);
        	  for (int j=0; j<rep; j++)
        		  sb.append(ch);
          }
          System.out.println(sb.toString());
      }
     
    } 
}
