import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();
    
    int num = Integer.parseInt(br.readLine());
    int[][] arr = new int[num][2];
    
    for(int i=0; i<num; i++) {
      st = new StringTokenizer(br.readLine());
      arr[i][0] = Integer.parseInt(st.nextToken());
      arr[i][1] = Integer.parseInt(st.nextToken());
    }
    
    for(int i=0; i<num; i++) {
      int rank = 1;
      
      for(int j=0; j<num; j++) {
        if(i==j)continue;
        if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
          rank++;
        }
      }
      sb.append(rank).append(' ');
    }
    System.out.println(sb);
  }
}
