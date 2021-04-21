
public class Main {
    public static void main(String[] args)  {
      
      // boolean 배열 선언 - default false로 초기화
      // false인 경우 selfNumber가 된다
      boolean[] numCheck = new boolean[10001];
      
      for(int i=1; i<10001; i++) { 
        int n = d(i);
        // 생성자가 존재하는 경우 true
        if(n<10001) numCheck[n]=true; 
      }
      for(int i=1; i<10001;i++) {
        if(!numCheck[i])
          System.out.println(i);
      }
    }
  
    public static int d(int num) {
      
      // number 초기화 이유 : 자기자신과 모든 자릿수를 더하기 때문에 자기자신을 초기값으로 설정하면 한과정을 줄일 수 있다
      int sum = num;
      while(num!=0) {
        sum = sum + (num%10);
        num = num/10;
      }
      return sum;
    }
  
}
