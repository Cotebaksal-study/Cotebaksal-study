#include<iostream>

using namespace std;

int main() {

    cin.tie(NULL);
    std::ios_base::sync_with_stdio(false);

    int n, x, tmp;
    cin >> n >> x;

    for (int i = 0; i < n; i++) {
        //입력으로 숫자 + 공백으로 구성된 한줄이 들어와도 int 형 하나만 입력 받음
        //하나 입력 받은 후, 공백으로 구분된, 다음 int 형 숫자 입력 받음.
        cin >> tmp;
        if (tmp < x) cout << tmp << " ";
    }

    return 0;
}

/*
[입력]
10 5
1 10 4 9 2 3 8 5 7 6

[출력]
1 4 2 3

*/
