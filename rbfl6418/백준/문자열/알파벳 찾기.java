import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No3 {

    public static void main(String[] args) throws IOException {   
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        //길이가 26(알파벳 개수:26개)인 스트링버퍼 생성
        StringBuffer result = new StringBuffer(26); 
        for (int j = 97; j < 123; j++) {
            //한글자씩 아스키코드 97~122까지 비교
                //입력받은 단어길이만큼 반복
                if(s.contains(String.valueOf((char)j))) {
                    //알파벳이 단어에 포함되어 있는 경우 : 처음 등장 위치(인덱스)를 출력
                    result.append(s.indexOf((char)j)+" ");
                }else {
                    //포함되어있지 않은 경우 : -1 출력
                    result.append("-1 ");
                }
        }
        System.out.println(result);
    }
}
