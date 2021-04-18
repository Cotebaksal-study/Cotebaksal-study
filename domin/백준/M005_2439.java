import java.io.*;
import java.lang.*;

class Main{
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
     
            int row = Integer.parseInt(br.readLine());
     
            for(int i = 1; i <= row; i++){
                int blank = Math.abs(i-row);
                // i = 1 , 공백 4
                StringBuilder sb = new StringBuilder();
                for(int j = 0; j<blank; j++){
                    sb.append(" ");
                }
     
                for(int k = 0; k < i; k++){
                    sb.append("*");
                }
                bw.write(sb.toString()+"\n");
            }
     
            br.close();
            bw.flush();
            bw.close();
        }
    
}
