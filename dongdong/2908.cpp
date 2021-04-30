#pragma warning(disable : 4996)
#include<iostream>
#include<string>

using namespace std;

int Reverse(string a) {
    int reverse;

    int tmp = a[0];
    a[0] = a[2];
    a[2] = tmp;

    reverse = stoi(a);

    return reverse;
}

int main() {

    string a, b;

    getline(cin, a, ' ');
    getline(cin, b);

    int int_a = Reverse(a);
    int int_b = Reverse(b);

    int answer = (int_a > int_b) ? int_a : int_b;

    cout << answer << '\n';

    return 0;
}
