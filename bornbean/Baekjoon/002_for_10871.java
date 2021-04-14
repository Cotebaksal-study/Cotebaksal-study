import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int arr[] = new int[N];
        st = new StringTokenizer(bf.readLine());
        
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < N; i++) {
            if (arr[i] < X) {
                sb.append(arr[i]).append(" ");
            }
        }
        System.out.println(sb);
    }
}
