import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
    // 입력받은 수
    int num = Integer.parseInt(bf.readLine());
    
    // 한수의 수
    int count = 0;
    
    for (int i=1; i<=num; i++) {
      // isHansu(i) i가 한수인 경우
      if(isHansu(i)) count++; 
    }
    System.out.println(count);
  }
  
  public static boolean isHansu(int number) {
    
    
    
