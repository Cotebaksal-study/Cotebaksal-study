import java.io.*;

class Main {
    public static int d(int k){
        int sum = k;
        while(k!= 0) { 
            sum += k % 10;
            k = k / 10;
        }
        return sum;
    }

    public static void main (String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = 10000;
        for(int i = 1; i <= num; i++){
        // n 보다 앞숫자
        
            boolean flag = false;
            for(int k = 0; k < i; k++){
                if(d(k) == i){
                // 하나라도 있으면 true
                  flag = true;
                  break;
                }
                
                if(k == i-1 && flag == false){    // 다돌았는데 아니면 출력
                  bw.write(i+"\n");
                  
                }
        
            }
        }
        
        bw.flush();
        bw.close();
    }
}
