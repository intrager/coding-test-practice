import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] arr = br.readLine().split(" ");
        
        int A = Integer.parseInt(arr[0]);
        int B = Integer.parseInt(arr[1]);
    
        if(A/2 >= B) System.out.print(B);
        else System.out.print(A/2);
    }
}