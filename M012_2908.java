import java.util.*;


public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());

        StringBuilder num1 = new StringBuilder(st.nextToken()).reverse();
        StringBuilder num2 = new StringBuilder(st.nextToken()).reverse();

        boolean flag = (Integer.parseInt(num1.toString()) > Integer.parseInt(num2.toString());
        System.out.println(flag? num1.toString(): num2.toString());

        sc.close();
    }
}
