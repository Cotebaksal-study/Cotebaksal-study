import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        the4th();
    }
    
    public static void the4th() {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        sc.nextLine(); //개행
        
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        sc.nextLine(); //개행
        
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        
        int resultX = x1;
        int resultY = y1;
        
        if(x1 == x2) {
            resultX = x3;
        }else if(x1 == x3) {
            resultX = x2;
        }
        
        if(y1 == y2) {
                resultY = y3;
        }else if(y1 == y3) {
                resultY = y2;
        }
        
        System.out.println(resultX +" " +resultY);
    }
}
