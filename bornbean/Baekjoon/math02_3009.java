import java.util.*;
import java.io.*;

public class Main {
  
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] A = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
    st = new StringTokenizer(br.readLine());
    int[] B = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
    st = new StringTokenizer(br.readLine());
    int[] C = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
    int[] D = new int[2];
 
		if (A[0] == B[0]) {
			D[0] = C[0];
		}	else if (A[0] == C[0]) {
			D[0] = B[0];
		}	else {
			D[0] = A[0];
		}	
    
    if (A[1] == B[1]) {
			D[1] = C[1];
		}	else if (A[1] == C[1]) {
			D[1] = B[1];
		}	else {
			D[1] = A[1];
		}
		
		System.out.println(D[0] + " " + D[1]);
    
  } 
}
