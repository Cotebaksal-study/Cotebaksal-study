import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());
        System.out.println(isLeapYear(year));
        
        br.close();
    }
    
    public static int isLeapYear(int year){ 
        if((year%4==0 && year%100 != 0)||year%400==0){
            return 1;
        }else{
            return 0;
        }
    }
}
