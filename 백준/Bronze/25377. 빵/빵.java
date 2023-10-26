import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int minTime = Integer.MAX_VALUE;
        while(N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            
            if(A <= B) minTime = Math.min(minTime, B);
        }
        if(minTime == Integer.MAX_VALUE) System.out.print(-1);
        else System.out.print(minTime);
    }
}