import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] strArr = br.readLine().split(" ");
        
        int[] arr = new int[3];
        for(int i = 0; i < 3; i++) arr[i] = Integer.parseInt(strArr[i]);
        
        Arrays.sort(arr);
        
        System.out.print(arr[2] + arr[1]);
    }
}