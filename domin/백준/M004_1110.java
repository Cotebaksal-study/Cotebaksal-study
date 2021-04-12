package dm210412;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 선언해놓고 안쓴 구문 수정
public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
	
		int result = plusCycle(input);
		System.out.println(result);
		br.close();
	}
	
	public static int plusCycle(String input) {
		boolean bool = true;
		int loop = 0;
		
		int number = Integer.parseInt(input);
		if(number >= 0 && number <= 99){
			
			while(bool) {
				int n1 = number / 10;    
				int n2 = number - n1*10;  // int n2 = number % 10;
				number = n2*10 +  (n1 + n2) % 10 ; 
				loop++;
        
				if(input.equals(number+"")) {
					bool = false;
					break;	
				}
			}
		}
		return loop;
	}
		
}
