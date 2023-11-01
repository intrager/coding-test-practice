import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        while(n-- > 0) {
            String[] arr = br.readLine().split(" ");
            int p = Integer.parseInt(arr[0]);
            int t = Integer.parseInt(arr[1]);
            
            for(int i = 1; i <= t; i++) {
                if(i % 7 == 0) p--;
                if(i % 4 == 0) p++;
            }
            System.out.println(p);
        }
    }
}