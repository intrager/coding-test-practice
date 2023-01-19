import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] arr = br.readLine().split(" ");
        int A = Integer.parseInt(arr[0]);
        int B = Integer.parseInt(arr[1]);
        while(A != 0 && B != 0) {
            System.out.println(A+B);
            arr = br.readLine().split(" ");
            A = Integer.parseInt(arr[0]);
            B = Integer.parseInt(arr[1]);
        }
    }
}