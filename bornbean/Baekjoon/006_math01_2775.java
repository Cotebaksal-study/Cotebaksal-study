import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
    int[][] people = new int[15][15];
    int testcase = Integer.parseInt(bf.readLine());
    int floor;
    int roomN;
    
    // i = floor , j = roomN
    for(int i=0; i<14; i++) {
      for(int j=0; j<15; j++) {
        if(j==0)
          people[i][j] = 1;
        else if(i==0)
          people[i][j] = j+1;
        else
          people[i][j] = people[i][j-1] + people[i-1][j];
      }
    }
    
    for(int i=0; i<testcase; i++) {
      floor = Integer.parseInt(bf.readLine());
      roomN = Integer.parseInt(bf.readLine());
      System.out.println(people[floor][roomN-1]);
    }
  }
}
