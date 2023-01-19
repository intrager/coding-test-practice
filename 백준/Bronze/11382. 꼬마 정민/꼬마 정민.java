import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] arr = br.readLine().split(" ");
        System.out.println(Long.parseLong(arr[0]) + Long.parseLong(arr[1]) + Long.parseLong(arr[2]));
    }
}