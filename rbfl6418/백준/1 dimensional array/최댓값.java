import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = new String[9];
		for (int i = 0; i < 9; i++) {
			 s[i] = br.readLine();
		}
		
		int[] n = new int[9];
		int max = Integer.parseInt(s[0]);
		for (int i = 0; i < s.length; i++) {
			n[i] = Integer.parseInt(s[i]);
			max = Math.max(n[i], max);	
		}
		
		for (int i = 0; i < s.length; i++) {
			if(n[i] == max) {
				System.out.println(n[i]);
				System.out.println(i+1);
			}
		}
	}
}
