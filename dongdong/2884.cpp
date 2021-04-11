
#include<iostream>

using namespace std;

int main() {

    int hour, min;
    cin >> hour >> min;

    if (min < 45) {
        if (hour == 0)
            printf("%d %d", 23, 60 - (45 - min));
        else 
            printf("%d %d", hour - 1, 60 - (45 - min));
    }
    else {
        printf("%d %d", hour, min - 45);
    }
    return 0;
}
