import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int answer = N;
		int num = 0;

		//생성자는 항상 N보다 작다
		for (int i = N - 1; i > 0; i--) {
			int temp = 0;
			num = i;
			//자리수를 다 더한 값 구하기
			for (;;) {
				temp += num % 10;
				num = num / 10;
				if (num == 0)
					break;
			}
			//생성자인경우 가장 작은 값만 저장
			if(temp + i == N && answer > i) {
				answer = i;
			}
		}

		//없는 경우 0 출력
		if(answer == N)
			bw.write(String.valueOf(0));
		else
			bw.write(String.valueOf(answer));
		
		bw.flush();
		bw.close();
	}
}
