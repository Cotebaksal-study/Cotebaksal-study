import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String N = br.readLine();
    
    int length = N.length();
    
    int num = Integer.parseInt(N);
    int result = 0;
    
    for(int i=num-9*length; i<num; i++) {
      int temp = i;
      int sum = 0;
      
      while(temp != 0) {
        sum += temp%10;
        temp /= 10;
      }
      
      if(sum + i == num) {
        result = i;
        break;
      }
  }
    System.out.println(result);
  }
}
