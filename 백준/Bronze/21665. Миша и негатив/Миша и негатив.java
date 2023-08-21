import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        
        int B1 = 0, W1 = 0, B2 = 0, W2 = 0;
        char[][] pixel = new char[n][m];
        for(int i = 0; i < n; i++) {
            String str = br.readLine();
            for(int j = 0; j < m; j++) {
                pixel[i][j] = str.charAt(j);
            }
        }
        br.readLine();
        int count = 0;
        for(int i = 0; i < n; i++) {
            String str = br.readLine();
            for(int j = 0; j < m; j++) {
                if(pixel[i][j] == str.charAt(j)) count++;
            }
        }
        System.out.print(count);
    }
}