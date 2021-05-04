import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
      
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      
      StringTokenizer st = new StringTokenizer(bf.readLine());
      
      int result;
      
      int A = Integer.parseInt(st.nextToken());
      int B = Integer.parseInt(st.nextToken());
      int C = Integer.parseInt(st.nextToken());
      
      if((C-B)<=0)
    	  result = -1;
      else
    	  result = (A/(C-B)) + 1;
    	  
      System.out.println(result);
    } 
}
