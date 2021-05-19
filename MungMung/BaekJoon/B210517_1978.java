import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int N = input.nextInt(); // 수의 개수
		int answer = N;
		for (int i = 0; i < N; i++) {
			int num = input.nextInt();

			if (num == 1) // 1은 소수가 아님
				answer--;

			if (num != 2 && num != 3) { // 2와 3은 무조건 소수, 1로 나누는 if문 추가하기 귀찮으므로 빼 줌

				int sqrt = (int) Math.floor(Math.sqrt(num)); // 제곱근까지만 보면 소수인지 알 수 있음

				for (int j = 2; j <= sqrt; j++) {
					if (num % j == 0) { // 소수가 아닌 경우
						answer--;
						break;
					}
				}
			}
		}

		System.out.println(answer);
	}
}
