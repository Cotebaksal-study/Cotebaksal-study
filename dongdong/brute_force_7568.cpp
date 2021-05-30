#include<iostream>

using namespace std;

int main() {

    int t;
    cin >> t;

    int *x = new int[t];
    int *y = new int[t];
    int* rank = new int[t];

    for(int i = 0; i< t; i++){
        int a, b;
        cin >> a >> b;
        x[i] = a;
        y[i] = b;
    }
    for (int i = 0; i < t; i++) {
        int cnt = 0;
        for (int j = 0; j < t; j++) {
            if (i == j) continue;
            else {
                if (x[j] > x[i] && y[j] > y[i]) cnt++;
            }
        }
        rank[i] = cnt + 1;
    }

    for(int i = 0; i < t; i++) {
        cout << rank[i] << ' ';
    }

    return 0;
}


/*
[ 설명 ]
- 카테고리가 브루트 포스라서 하나하나 다 찾는 방식으로 풀었습니다
- 이중 포문에서 첫번째 for문으로 i 번째의 사람이 몇번째로 덩치가 큰지 구하기위해 
- j 로 0 부터 t-1 번째 의 사람들에 접근하면서 i 보다 덩치가 크다면 cnt ++ 해주었습니다.
- j==i 라면 같은 사람이기에 continue로 넘겨주었습니다.
*/
