import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
      
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      
      // 5kg와 3kg인지 확인
      boolean check = false;
      // 5kg과 3kg 봉지 갯수
      int fiveM=0;
      int threeM=0;
      int temp;
      
      int total = Integer.parseInt(bf.readLine());
      
      fiveM = total/5;
      temp = total - (fiveM*5);
      
      while(check==false&&fiveM>=0) {
       
        if(temp%3==0) {
          check = true;
          threeM = temp/3;
        }
        else {
          fiveM--;
          temp = temp + 5;
        }
      }
      if(check == true) {
        System.out.println(fiveM+threeM);
      } else {
        System.out.println("-1");
      }
    } 
}
