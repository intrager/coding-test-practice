import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] arr = br.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int W = Integer.parseInt(arr[1]);
        int H = Integer.parseInt(arr[2]);
        int L = Integer.parseInt(arr[3]);
    
        int width = W / L;
        int height = H / L;
        int maxCow = width * height > N ? N : width * height;
        System.out.print(maxCow);
    }
}