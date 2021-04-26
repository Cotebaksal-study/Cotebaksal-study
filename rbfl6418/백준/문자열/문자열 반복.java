import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No4 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        //테스트 케이스 개수 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        //T횟수만큼 반복해서 
        for(int i = 0; i < T; i++) {
            //반복횟수 R, 문자열 S를 공백으로 입력받기
            StringTokenizer stn = new StringTokenizer(br.readLine()," ");
            int R = Integer.parseInt(stn.nextToken());
            String S = stn.nextToken(); 
            //문자열 S를 한글자씩 쪼개서 담고
            String[] sArr = S.split("");
            String P = "";
            for (int j = 0; j < sArr.length; j++) {
                for(int z = 0; z < R; z++) {
                    //j번째 글자를 R번만큼반복해서 붙인다. 
                    P += sArr[j];
                }
            }
            //문자열 P를 출력
            System.out.println(P);
        }
    }
}
