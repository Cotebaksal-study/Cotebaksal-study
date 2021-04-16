import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder result = new StringBuilder();
		while (true) {
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(a != 0 & b != 0){
        result.append(a+b +"\n");
		  }else{
        break;
      }
    }
		System.out.println(result);
	}

}
