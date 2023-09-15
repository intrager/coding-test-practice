import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] arr = br.readLine().split(" ");
        Long N = Long.parseLong(arr[0]);
        Long M = Long.parseLong(arr[1]);
    
        System.out.print(N * M / 2);
    }
}