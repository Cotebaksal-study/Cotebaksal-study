import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();
    
    char[] charArr = br.readLine().toCharArray();
    int length = charArr.length;
    int[] arr = new int[length];
    
    for(int i=0; i<length; i++) {
      arr[i] = Character.getNumericValue(charArr[i]);
    }
    
    for(int i=0; i<length; i++) {
      for(int k=i+1; k<length; k++) {
        if(arr[i]<arr[k]) {
          int temp = arr[i];
          arr[i] = arr[k];
          arr[k] = temp;
        }
      }
      sb.append(arr[i]);
    }
    System.out.println(sb.toString());
  }
}
