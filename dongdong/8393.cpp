#include<iostream>

using namespace std;

int main() {
    int num = 0, sum = 0;

    cin >> num;

    if (num % 2 == 0)
        sum = (1 + num) * (num / 2);
    else 
        sum = (1 + num) * (num / 2) + (num / 2 + 1);

    cout << sum;

    return 0;
}
