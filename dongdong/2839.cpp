#include<iostream> 

using namespace std;

int main() {

	int N;
	int arr[5001];
	cin >> N;
	arr[0] = -1;
	arr[1] = -1;
	arr[2] = -1;
	arr[3] = 1;
	arr[4] = -1;
	arr[5] = 1;
	arr[6] = 2;
	arr[7] = -1;
	for (int i = 8; i <= N; i++) {
		if (i % 15 == 0 || i % 8 == 0) {
			arr[i] = arr[i - 3] > arr[i - 5] ? arr[i - 5] + 1 : arr[i - 3] + 1;
		}
		else if (i % 3 == 0) {
			arr[i] = arr[i - 3] + 1;
		}
		else if (i % 5 == 0) {
			arr[i] = arr[i - 5] + 1;
		}
		else {
			arr[i] = arr[i - 3] > arr[i - 5] ? arr[i - 5] + 1 : arr[i - 3] + 1;
		}
	}
	printf("%d", arr[N]);
	return 0;
}
