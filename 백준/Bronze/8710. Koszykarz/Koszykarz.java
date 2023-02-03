import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int k = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        w -= k;
        if(w <= 0) System.out.print(0);
        else {
            if(w % m != 0)
                System.out.print((w / m) + 1);
            else 
                System.out.print(w / m);
        }
    }
}