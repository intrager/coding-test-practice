import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        String[] arr;
        for(int i = 1; i <= T; i++) {
            arr = br.readLine().split(" ");
            int A = Integer.parseInt(arr[0]);
            int B = Integer.parseInt(arr[1]);
            int C = A + B;
            System.out.println("Case #" + i + ": " + A + " + " + B + " = " + C);
        }
    }
}