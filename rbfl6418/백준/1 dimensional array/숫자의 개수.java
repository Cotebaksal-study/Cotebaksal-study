import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//정수 3개 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		int num = a*b*c;
		String str = num+"";
		String[] sArr = str.split("");
		int[] nums = new int[sArr.length]; 
		
		for (int i = 0; i < sArr.length; i++) {
			nums[i] = Integer.parseInt(sArr[i]);
		}
		for (int i = 0; i < 10; i++) {
			int cnt=0;
			for (int j = 0; j < nums.length; j++) {
				if(i == nums[j]) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
}
