import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
      
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      
     // 알파벳의 빈도수를 저장할 배열
      int[] countAlpa = new int[26];
      // 빈도가 높은 문자 인덱스 저장
      int max = -1;
      int temp = 0;
      // 최대값의 개수 판단
      int maxNum = 0;
      
      // 입력
      String input = bf.readLine();
      char ch = ' ';
      
      // 입력받은 문자열에서 빈도수 추출
      for (int i=0; i<input.length(); i++) {
          ch = input.charAt(i);
          if (64<ch && ch<91) {
              countAlpa[ch-65]++;
              temp = countAlpa[ch-65];
          }
          else if (96<ch && ch<123) {
              countAlpa[ch-97]++;
              temp = countAlpa[ch-97];
          }
          if(temp >= max)
              max = temp;
      }
      
      // 최대입력한 문자열 출력
      for (int i=0; i<26; i++) {
          if(countAlpa[i] == max) {
              ch = (char)(i+65);
              maxNum++;
          }
      }
      if (maxNum>1)
          ch = '?';
      System.out.println(ch);
      
    }
}
