import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		for (int i = 2; i <= Math.sqrt(N); i++) { // 소수는 제곱근까지만 봐도 됨
			while (N % i == 0) { // N이 소수로 나누어떨어질 때
				bw.write(i + "\n");
				N = N / i;
			}
		}
		if (N != 1)
			bw.write(N + "\n"); // 다 나누고 남은 수(소수)
		bw.flush();
		bw.close();
	}
}
