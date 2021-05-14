#include<iostream>

using namespace std;

int main(){
    int max = 0, idx;
    for(int i = 0; i < 9; i++){
        int tmp;
        cin >> tmp;
        if(tmp > max) {
            max= tmp;
            idx = i+1;
        }
    }
    cout << max <<'\n'<< idx;
    
    
    return 0;
}
