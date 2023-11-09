import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] arr = br.readLine().split(" ");
        double w = Double.parseDouble(arr[0]);
        double h = Double.parseDouble(arr[1]);
    
        double corner = Math.sqrt(w*w + h*h);
        double square = w + h;
        System.out.print(square - corner);
    }
}