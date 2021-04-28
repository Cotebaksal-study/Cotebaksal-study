#include<iostream>
#include<cstdlib>

using namespace std;

int main() {

    //단어를 받기 위한 문자열 str
    string str = "";
    //알파벳 별로 str에 나타나는 위치를 저장하기 위한 배열
    int location[26];
    //location 함수 초기화
    fill_n(location, 26, -1);

    cin >> str;

    for (int i = 0; i < str.size(); i++) {
        //location에 저장할 위치 계산 
        //아스키 코드로 변경후, -97를 해서 배열 시작 위치를 0으로 설정
        int idx = (int)str[i] - 97;
        //값이 저장되어있지 않으면 idx에 str의 위치 저장
        if (location[idx] == -1) {
            location[idx] = i;
        }
    }
    for (int i = 0; i <= 25; i++) {
        cout << location[i] << ' ';
    }

    return 0;
}
