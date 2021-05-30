#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int solution(int n, vector<int> lost, vector<int> reserve) {
    int answer = 0;
    // 여블 체육복을 가져왔지만 잃어버린 사람 lost에서도 없애고, reserve에서도 없애기
    for(int i = 0; i < lost.size(); i++){
        for(int j = 0; j < reserve.size(); j++){
            if(lost[i] == reserve[j]){
                lost.erase(lost.begin()+i);
                reserve.erase(reserve.begin()+j);
            }
        }
    }
    // lost인 사람 reserve에서 빌릴 수 있는지 확인
    int cnt=0;
    for(int i = 0; i < lost.size(); i++){
        for(int j = 0; j< reserve.size();j++){
            // 앞이나 뒷 사람에세 빌릴 수 있으면 cnt++
            if(lost[i] - 1 == reserve[j] || lost[i]+1 == reserve[j]){
                reserve.erase(reserve.begin()+j);
                cnt++;
            }
        }
    }
    // 총 사람 수 에서 잃어버린 사람 수 빼고 다시 빌린 사람 수 더하기
    answer = n-lost.size()+cnt;
    return answer;
}
