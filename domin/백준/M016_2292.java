import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 1;    // 이동수
        int room = 2;   // 최소 방넘버
        
        if(n == 1){
            System.out.println(1);
        }else{
            while(n >= room){
                
                room  += 6 * (count++);
            }
            
            System.out.println(count);
        }

        
    }
}
