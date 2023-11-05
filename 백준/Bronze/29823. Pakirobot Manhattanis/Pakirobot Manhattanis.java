import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        
        int upDown = 0, leftRight = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'N') upDown++;
            else if(str.charAt(i) == 'S') upDown--;
            else if(str.charAt(i) == 'W') leftRight++;
            else leftRight--;
        }
        int sum = Math.abs(upDown) + Math.abs(leftRight);
        System.out.print(sum);
    }
}