#include<iostream>

using namespace std;

int main() {

    int n, answer = 0;
    cin >> n;
    for (int maker = 1; maker < n; maker++) {
        int tmp = maker;
        int sum = 0;
        while (tmp > 0) {
            sum += tmp % 10;
            tmp /= 10;
        }
        
        if (maker + sum == n) {
            answer = maker;
            break;
        }
    }
    cout << answer;
    return 0;
}

/*
[설명]
 - 1부터 n-1 까지 수를 증가시키며 n 의 생성자인지 확인했습니다.
 - while 문으로 각 자리수의 합을 구했습니다.
 - maker와 sum(각 자리수의 합)이 같다면 answer 에 넣어줍니다.
 - 만약 같다면 break 로 빠져나옵니다. 가장 작은 생성자를 구하면 되기 때문입니다.
 +) 맨첨에 풀 때 보기가 세자리라서 멍청하게 세자리만 하는 줄 알고 각 자릿수 구하는 식 적기 귀찮아서 for문 3개 써서 구한다고 방황 쫌 했습니다 .
입력과 조건 확인 또 확인 !
*/
