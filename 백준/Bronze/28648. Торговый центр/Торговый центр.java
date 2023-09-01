import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int min = Integer.MAX_VALUE;
        while(n-- > 0) {
            String[] arr = br.readLine().split(" ");
            int sum = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
            if(sum < min) min = sum;
        }
        System.out.print(min);
    }
}