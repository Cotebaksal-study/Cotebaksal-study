#include<iostream>

using namespace std;

int New(int n) {
    return ((n % 10) * 10) + ((n % 10 + n / 10) % 10);
}

int main() {

    int a, new_a=-1, cnt=0;

    cin >> a;
    new_a = a;
    while (true) {
        new_a = New(new_a);
        if (a == new_a) break;
        cnt++;
    }
    cout << cnt;
    return 0;
}

/*

1. 십의자리, 일의자리를 각각 저장하지 않고,
 ((n % 10) * 10) + ((n % 10 + n / 10) % 10) 식을 통해 한번에 새로운 수를 만들 수 있었습니다.
2. while(조건식)에 조건식을 적는 것 보다는 while문 내부에 if문를 통해 break 하면 더 깔금한 코드를 짤 수 있었습니다. 
새로운 수가 원래 수랑 같을 때 까지 ( new_a ==a ) 돌려야하는데 맨 처음에는 원래 수로 새로운 식을 만들어야합니다.
그래서 new_a = a 를 해주어야합니다. 이때, while문에 조건식을 적게 되면 실행되지 않기 때문에 if문을 통해 처리해 주었습니다.

*/
