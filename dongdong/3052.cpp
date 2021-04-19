#include<iostream>

using namespace std;

int main() {

    bool remainder_arr[42] = { false };
    int n, t=10, remainder, cnt = 0;

    while (t>0) {
        cin >> n;
        remainder = n % 42;
        if (!remainder_arr[remainder]) {
            remainder_arr[remainder] = true;
            cnt++;
        }
        t--;
    }

    cout << cnt;


    return 0;
}
