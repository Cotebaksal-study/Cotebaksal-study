#include<iostream>

using namespace std;

int main() {

    int n;
    cin >> n;

    int* arr = new int[n];

    for (int i = 0; i < n; i++) {
        int tmp;
        cin >> tmp;
        arr[i] = tmp;
    }

    for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j < n; j++) {
            if (arr[i] > arr[j]) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
    }

    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << '\n';
    }
    return 0;
}

/*
선택정렬
*/
