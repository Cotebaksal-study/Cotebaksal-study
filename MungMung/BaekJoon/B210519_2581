import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int M = input.nextInt();
		int N = input.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		int sum = 0;
		int min = 0;

		// N까지의 소수 구하기
		for (int i = 1; i <= N; i++) {
			if (isPrime(i)) {
				arr.add(i);
			}
		}

		// M 보다 작은 수 없애기
		int len = arr.size();
		for (int i = 0; i < len; i++) {
			if (arr.get(0) < M) {
				arr.remove(0);
			}
		}

		// 합과 가장 작은 수 구하기
		if (arr.size() == 0) { // 소수가 없을 때
			System.out.println(-1);
		} else {
			for (int i = 0; i < arr.size(); i++) {
				sum += arr.get(i);
			}
			System.out.println(sum);
			System.out.println(arr.get(0));
		}
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
