import java.io.*;
import java.util.StringTokenizer;
    
public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        
        if(min>=45) 
            System.out.println(hour +" "+ (min-45));
        else {
            if(hour==0) System.out.println(23  +" "+ (60-(45-min)));
            else
                System.out.println((hour-1)  +" "+ (60-(45-min)));}
    
    }
}
