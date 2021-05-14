
#include<iostream>
#include<string>

using namespace std;

int arr[10] = { 0 };

int main() {

    int a, b, c;
    cin >> a  >> b >> c;
    int mul = a * b * c;
    string str = to_string(mul);

    for (int i = 0; i < 10; i++) {
        for (int j = 0; j < str.length(); j++) {
            if ((str[j]-48) == i) {
                arr[i] = arr[i] + 1;
            }
        }
    }
    for (int i = 0; i < 10; i++) {
        cout << arr[i] << '\n';
    }
    return 0;
}
