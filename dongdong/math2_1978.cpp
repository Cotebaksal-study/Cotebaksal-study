#include<iostream>

using namespace std;

int isDecimal(int num) {
    int flag = 0;
    for (int i = 2; i < num; i++) {
        if (num % i == 0) {
            flag = 1;
            break;
        }
    }
    if (flag == 0) return 1;
    else return 0;
}

int main() {

    int n, cnt = 0;
    cin >> n;
    for (int i = 0; i < n; i++) {
        int num;
        cin >> num;
        if (num!=1 && isDecimal(num) cnt++;
        else continue;
    }
    cout << cnt;
    return 0;
}
/*
 - 소수인제 판별하는 함수를 정의해서 소수를 찾았습니다
- isDemical 함수의 for문에서 i 를 2 부터 num-1 까지 증가시키면서 num과 나누어 떨어지면 바로 break문으로 빠져나오도록 하고 flag를 1로 바꾸어 소수가 아님을 표시했습니다.
- 만약 flag 가 0 이면 소수라는 의미로 return 1을 하고, 1이면 소수가 아니라는 의미로 return 0를 합니다.
- for문을 i=2 부터 시작해서 1이 소수가 아님을 따로 적어주었습니다. ( if (num!=1 && isDecimal(num) )
- if문이 true일 때마다 cnt를 증가시켜서 갯수를 구했습니다.
*/
