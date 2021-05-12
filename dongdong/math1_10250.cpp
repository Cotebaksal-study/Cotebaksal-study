#include<iostream>

using namespace std;

int main(){
    
    int t;
    cin >> t;
    while(t>0){
        t--;
        int h=0,w=0,p=0;
        int hh=0,ww=0;
        cin >> h >> w >> p;
        for(int i = 1; i <= w; i++){
            for(int j = 1; j <= h; j++){
                p--;
                if(p==0) {
                    hh=j;
                    ww=i;
                    break;
                }
            }
        }
        cout << hh;
        cout.width(2);
        cout.fill('0');
        cout << ww << '\n';
    }
    
    return 0;
}
