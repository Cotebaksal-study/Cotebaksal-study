import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No06 {

    public static void main(String[] args) throws IOException {
        //한줄로 문자열 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        //공백을 구분자로 토큰에 담기
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        //hasNextToken()이 true일 동안 반복
        while(st.hasMoreTokens()) {
            //단어 개수 cnt를 ++하기
            cnt++;
            //다음 단어꺼내기
            st.nextToken();
        }
        System.out.println(cnt);
    }
}
