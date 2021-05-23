import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
    public static void main (String[] args) throws java.lang.Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int count = 0;
        int n = X;
        while(n > 0){
            count ++;
            n -= count;
        }
        
        if(count % 2 == 0)    System.out.println((count + n ) +"/"+ (1 - n));
        else    System.out.println((1 - n) + "/" +(count + n));
        
    
    }
}
