import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
      
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      
      StringTokenizer st = new StringTokenizer(bf.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      int v = Integer.parseInt(st.nextToken());
      
      int count = 1;
      boolean high_check = false;
      int now_height = 0;
      
      while(!high_check) {
        
        now_height += a;
        if(now_height>v) {
          high_check=true;
          break;
        }
        now_height -= b;
        count++;
      }
      System.out.println(count);
    } 
}
