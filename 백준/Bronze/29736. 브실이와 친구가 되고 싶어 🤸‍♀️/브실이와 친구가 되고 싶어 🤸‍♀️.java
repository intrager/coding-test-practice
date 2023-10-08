import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
    
        st = new StringTokenizer(br.readLine(), " ");
        int K = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        
        int friend = 0;
        for(int i = A; i <= B; i++) {
            if(Math.abs(K - i) <= X) friend++;
        }
        if(friend == 0) System.out.print("IMPOSSIBLE");
        else System.out.print(friend);
    }
}