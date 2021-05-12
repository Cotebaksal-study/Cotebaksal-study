#include<iostream> 

using namespace std;

int main() {
    int n = 0;
    int up = 0, down = 0;
    cin >> n;
    for (int i = 1; i < 10000000; i++) {
        if (n > i) {
            n -= i;
        }
        else {
            if ((i + 1) % 2 == 0) {
                down = n;
                up = (i + 1) - down;
            }
            else {
                up = n;
                down = (i + 1) - up;
            }
            break;
        }
    }
    cout << up << "/" << down;

    return 0;
}
