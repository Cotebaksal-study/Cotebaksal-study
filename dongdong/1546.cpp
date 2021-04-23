#include<iostream>

using namespace std;

int main(){
    
    int n;
    cin >> n;
    float *score = new float[n];
    
    int max = 1;
    for(int i = 0; i<n;i++){
        cin >> score[i];
        if(max < score[i])
            max = score[i];
    }
    
    float sum=0, avg=0;
    for(int i = 0; i<n; i++){
        score[i] = score[i] / max * 100;
        sum += score[i];
    }
    avg = sum / (float)n;
    cout << avg;
    return 0;
}
