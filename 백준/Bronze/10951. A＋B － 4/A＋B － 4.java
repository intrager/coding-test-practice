import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] arr;
        while(br.ready()) {
            arr = br.readLine().split(" ");
            int A = Integer.parseInt(arr[0]);
            int B = Integer.parseInt(arr[1]);
            System.out.println(A+B);
        }
    }
}