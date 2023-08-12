import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] arr = br.readLine().split(" ");
        int S = Integer.parseInt(arr[0]);
        int T = Integer.parseInt(arr[1]);
        int D = Integer.parseInt(arr[2]);
    
        System.out.print((D/(S*2)) * T);
    }
}