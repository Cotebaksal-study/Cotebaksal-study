import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main
{
    public static void main (String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
 
        System.out.println(bonji(N));
    }
 
    public static int bonji(int N){
        int count = 0;
       while(true) {
            if(N%5 == 0) { count += N / 5; break;}
            N -= 3;
            count ++;
            
            if(N < 0) {
                count = -1;
                break;
            }
        }
         return count;
 
    }
}
