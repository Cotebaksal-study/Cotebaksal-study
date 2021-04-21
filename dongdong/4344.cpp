#include<iostream>

using namespace std;

int main() {

    int testCase = 0, n = 0;

    cin >> testCase;
    while (testCase > 0) {
        testCase--;
        cin >> n;

        int* arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            cin >> arr[i];
            sum += arr[i];
        }
        int avg, cnt = 0;
        float rate;
        avg = sum / n;
        for (int i = 0; i < n; i++) {
            if (arr[i] > avg)
                cnt++;
        }
        rate = ( (float)cnt / (float)n)*100;
        cout << fixed;
        cout.precision(3);
        cout << rate << '%' << '\n';
    }

    return 0;
}
