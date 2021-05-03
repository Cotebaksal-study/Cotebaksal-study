#include <string>
#include <vector>
#include <iostream>
using namespace std;

string ban_str = "~!@#$%^&*()=+[{]}:?,<>/";

string solution(string new_id) {
    //1단계 대문자 -> 소문자
    for (int i = 0; i < new_id.length(); i++) {
        new_id[i] = tolower(new_id[i]);
    }

    //2단계 특수문자 제거
    //가능한 영어 소문자, 숫자, _ , -, . 이면 다음 확인
    //아니라면 해당 인덱스 지우고 다시 검사
    for (int i = 0; i < new_id.length();) {
        if (new_id[i] >= 'a' && new_id[i] <= 'z' || new_id[i] >= '0' && new_id[i] <= '9'
            || new_id[i] == '-' || new_id[i] == '_' || new_id[i] == '.')
        {
            i++;
            continue;
        }
        new_id.erase(new_id.begin() + i);
    }
  
    //3단계 연속 . 제거
    for (int i = 0; i < new_id.length();) {
        //i 인덱스가 .이고 i+1도 . 일 경우
        if ((new_id[i] == '.') && (new_id[i + 1] == '.')) {
            // i 인덱스의 해당 . 삭제
            new_id.erase(i,1);
            //i++ 하지 않음 -> 새로운 id의 i 인덱스부터 다시 확인
        }
        else {
            //아니라면 다음 인덱스 확인
            i++;
        }
    }
    
    //4단계 맨앞과 맨뒤의 . 제거
    if (new_id[0] == '.') new_id.erase(new_id.begin());
    if (new_id[new_id.length() - 1] == '.') new_id.erase(new_id.end()-1);


    //5단계 비었을 경우 a 추가
    if (new_id.empty()) new_id += "a";


    //6단계 16자 이상이면 제거
    if (new_id.length() >= 16) {
        new_id.erase(15, new_id.length() - 1);
    }
    if (new_id[new_id.length() - 1] == '.') new_id.erase(new_id.end()-1);


    //7단계 3자리 이하이면 추가
    if (new_id.length() < 3) {
        while (new_id.length() != 3) {
            new_id += new_id[new_id.length()-1];
        }
    }

    return new_id;
}
