#include<iostream>
using namespace std;

int main() {

    int t = 0, k = 0, n = 0;
    cin >> t;
    while (t > 0) {
       int arr[15][15];

        for (int i = 0; i <= 14; i++) {
            arr[0][i] = i;
            arr[i][0] = 0;
        }

        cin >> k >> n;
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= n; j++) {
                arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
            }
        }
        cout << arr[k][n] << '\n';
        t--;
    }
    return 0;

}
