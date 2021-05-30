import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] arr;
		String[] nums;
		int N = 0;
		int M = 0;
		int answer = 0;
		
		arr = br.readLine().split(" ");
		nums = br.readLine().split(" ");
		
		N = Integer.parseInt(arr[0]);
		M = Integer.parseInt(arr[1]);
		
		for(int i=0; i<N; i++) {
			for(int j=i+1; j<N; j++) {
				for(int k=j+1; k<N; k++) {
					int temp = Integer.parseInt(nums[i]) + Integer.parseInt(nums[j]) + Integer.parseInt(nums[k]);
					if(M >= temp && temp > answer)
						answer = temp;
				}
			}
		}
		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
	}
}
