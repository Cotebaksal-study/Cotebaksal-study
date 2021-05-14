#include<iostream>

using namespace std;

int main(){
    
    int n=0;
    cin >> n;
    int min=1000000, max= -1000000;
    for(int i = 0; i< n;i++){
        int tmp = 0;
        cin >> tmp;
        if(tmp > max) max = tmp;
        if(tmp < min) min = tmp;
    }
     cout << min <<" "<<max;
    return 0;
}
