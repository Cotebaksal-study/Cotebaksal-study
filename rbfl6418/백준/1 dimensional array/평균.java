import java.io.BufferedReader;
import java.io.IOException;


public class No05 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        //시험 본 과목 개수 입력
        int num = Integer.parseInt(br.readLine());
        
        //현재 성적 입력
        double sum = 0;
        double max = 0;
        double[] nums = new double[num];
        String[] s = br.readLine().split(" ");
        for (int i = 0; i < num; i++) {
            //입력받은 문자열을 int형 배열에 담음
            nums[i] = Integer.parseInt(s[i]);
            //입력된 점수 중 최대값 고르기
            if(nums[i]>max) max = nums[i];
        }
            
        for (int j = 0; j < num; j++) {
            //새로운 값 구해서 초기화
            nums[j] = nums[j]/max*100;
            //모든 과목의 합
            sum += nums[j];
        }
        //새로운 평균을 출력
        System.out.println(sum/num);
    }

}
