#include<iostream>
#include<string>

using namespace std;

int main() {

    int t = 0;
    cin >> t;
    while (t > 0) {
        t--;
        string str = " ";
        int cnt = 0, sum = 0;
        cin >> str;
        for (int i = 0; i < str.length(); i++) {
            if (str[i] == 'O')
                cnt++;
            if (str[i] == 'O') {
                sum += cnt;
            }
            else {
                cnt = 0;
            }
        }
        cout << sum << '\n';
    }

    return 0;
}
