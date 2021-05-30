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
