import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No01 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		String[] nArr = br.readLine().split(" ");
		int min,max;
		min = max = Integer.parseInt(nArr[0]);
			for (int i = 1; i < size; i++) {
				int target = Integer.parseInt(nArr[i]);
				
				if (target < min)  min = target; 
				if (target > max)  max = target; 
				System.out.println("min: "+min+", max: "+max);
			}
		System.out.println(min + " " + max);
	}
}
