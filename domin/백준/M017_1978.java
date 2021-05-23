import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();        
        int count = 0;
        
        for(int i = 0; i < N; i++) {             
            boolean flag = true;
            int num = in.nextInt();
            
            if(num == 1) {
                continue;
            }
            for(int j = 2; j < num; j++) {
                if(num % j == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                count++;
            }
        }
        System.out.println(count);
    }
 
}
