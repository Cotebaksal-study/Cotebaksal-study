import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No06 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//테스트 개수
		int num = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < num; i++) { 
			String[] s = br.readLine().split("");
			int cnt = 0;
			int result = 0;
			//입력받은 한 줄 OX판별하기
			for (int j = 0; j < s.length; j++) {
				//X인 경우 cnt를 0으로 초기화
				if(s[j].equals("X")) {
					cnt = 0;
				}else {
				//O인 경우 cnt에 1 더하기
				cnt++;
				result += cnt;
				}
			}
			System.out.println(result);
		}
	}
}
