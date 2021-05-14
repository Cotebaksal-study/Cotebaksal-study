#include<iostream>

using namespace std;

int main() {

    int n = 0;
    cin >> n;
    int tmp = 1, cnt = 1, i = 0;

    while (tmp < n) {
        tmp = tmp + (6 * ++i);
        cnt++;
    }
    cout << cnt;

    return 0;
}
