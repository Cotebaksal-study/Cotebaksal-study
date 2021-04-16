import java.io.*;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
      
      // Reader 객체 생성
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      // StringTokenizer - 입력을 split하여 받아올 객체 생성
      StringTokenizer st;
      String str;
      
      // A+B 합을 저장할 String Builder 생성
      StringBuilder sb = new StringBuilder();
     
      while( (str = bf.readLine()) != null ) {
        st = new StringTokenizer(str, " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        sb.append(a+b).append("\n");
      }
      System.out.print(sb);
    }
}
