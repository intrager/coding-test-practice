import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        while(N-- > 0) {
            String[] arr = br.readLine().split(" ");
            int i = Integer.parseInt(arr[0]);
            int f = Integer.parseInt(arr[1]);
            if((i <= 1 && f <= 2) || (i <= 2 && f <= 1))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}