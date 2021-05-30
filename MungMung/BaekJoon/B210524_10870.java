import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int ans = piv(N);
		System.out.println(ans);
	}
	
	public static int piv(int num) {
		if(num==0)
			return 0;
		else if(num==1)
			return 1;
		else {
			return piv(num-1) + piv(num-2);
		}
	}
}
