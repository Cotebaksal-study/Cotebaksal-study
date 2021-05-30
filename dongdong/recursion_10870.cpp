#include<iostream>

using namespace std;

int fib(int n) {
    int f[20];
    f[0] = 0;
    f[1] = 1;
    for (int i = 2; i <= n; i++) {
        f[i] = f[i - 1] + f[i - 2];
    }
    return f[n];
}

int main() {
    int n;
    cin >> n;
    cout << fib(n);
    return 0;
}

/*
- 피보나치수 구하는 공식을 그대로 적용하여 풀었습니다 
- 0 과 1은 먼저 초기화 시켜주고 피보나치수를 구했습니다!
*/
