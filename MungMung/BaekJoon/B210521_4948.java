import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		ArrayList<Integer> arr = new ArrayList<>();
		ArrayList<Integer> primeArr = new ArrayList<>();

		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0)
				break;
			arr.add(n);
		}

		for (int i=0; i<arr.size();i++) {

			// 2n까지의 소수 구하기
			for (int j = 1; j <= 2 * arr.get(i); j++) {
				if (isPrime(j)) {
					primeArr.add(j);
				}
			}

			// n 보다 작거나 같은 수 없애기
			int len = primeArr.size();
			for (int j = 0; j < len; j++) {
				if (primeArr.get(0) <= arr.get(i)) {
					primeArr.remove(0);
				}
			}
			bw.write(primeArr.size()+"\n");
			primeArr.clear();
		}
		bw.flush();
		bw.close();
	}

	// 소수인지 구하는 함수
	public static boolean isPrime(int num) {

		if (num == 1) // 1은 소수가 아님
			return false;

		if (num == 2 || num == 3)
			return true;

		if (num != 2 && num != 3) { // 2와 3은 무조건 소수, 1로 나누는 if문 추가하기 귀찮으므로 빼 줌

			int sqrt = (int) Math.floor(Math.sqrt(num)); // 제곱근까지만 보면 소수인지 알 수 있음

			for (int j = 2; j <= sqrt; j++) {
				if (num % j == 0) { // 소수가 아닌 경우
					return false;
				}
			}
		}
		return true;
	}
}
