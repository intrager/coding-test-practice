import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] maxScoreStrArr = br.readLine().split(" ");
        String[] whoScoreStrArr = br.readLine().split(" ");
        
        int x = Integer.parseInt(maxScoreStrArr[0]);
        int y = Integer.parseInt(maxScoreStrArr[1]);
        int z = Integer.parseInt(maxScoreStrArr[2]);
        
        int x2 = Integer.parseInt(whoScoreStrArr[0]);
        int y2 = Integer.parseInt(whoScoreStrArr[1]);
        int z2 = Integer.parseInt(whoScoreStrArr[2]);
        
        if(y2 * 2 < y) System.out.print("E");
        else if(y2 < y) System.out.print("D");
        else if(x2 * 2 < x) System.out.print("C");
        else if(x2 < x) System.out.print("B");
        else System.out.print("A");
    }
}