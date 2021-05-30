import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int ans = mul(N);
		System.out.println(ans);
	}

	public static int mul(int num) {
		if(num!=0)
			return num * mul(num-1);
		else
			return 1;
	}
}
