#include<iostream>

using namespace std;

int isYun(int year) {
    if (year % 4 == 0 &&
        (year % 100 != 0 || year % 400 == 0))
        return 1;
    else
        return 0;
}

int main() {
    int year;
    cin >> year;
    printf("%d", isYun(year));
    return 0;
}
