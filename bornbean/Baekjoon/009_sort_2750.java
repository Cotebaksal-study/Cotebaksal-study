import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();
    
    int count = Integer.parseInt(br.readLine());
    int[] arr = new int[count];
    
    for(int i=0; i<count; i++) {
      arr[i] = Integer.parseInt(br.readLine());
    }
    
    for(int i=0; i<count; i++) {
      for(int k=i+1; k<count; k++) {
        if(arr[i] > arr[k]) {
          int temp = arr[i];
          arr[i] = arr[k];
          arr[k] = temp;
        }
      }
      sb.append(arr[i]).append("\n");
    }
    System.out.println(sb.toString());
  }
}
