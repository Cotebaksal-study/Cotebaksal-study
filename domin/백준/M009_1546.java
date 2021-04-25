import java.io.*;

class Main{

    public static void main (String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        
        int[] arr = new int[count];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < count; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        // max 를 구함
        int max = arr[0];
        for(int i = 0; i < count; i++) {
            if(max < arr[i]) { 
                max = arr[i];
            }
        }
        
        // 새 평균을 구하는 식        
        double sum = 0;
        for(int i = 0; i <count; i++) {
            sum += ((double)arr[i]/max) * 100;
        }
        
        System.out.println(sum/count);
        
        br.close();
        
    }
}
