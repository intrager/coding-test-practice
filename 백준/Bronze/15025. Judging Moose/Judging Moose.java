import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] arr = br.readLine().split(" ");
        int left = Integer.parseInt(arr[0]);
        int right = Integer.parseInt(arr[1]);
        
        if(left == 0 && right == 0) System.out.print("Not a moose"); 
        else if(left == right) System.out.print("Even " + (left + right));
        else System.out.print("Odd " + Math.max(left, right) * 2);
    }
}