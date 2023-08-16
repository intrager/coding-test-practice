import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] arr = br.readLine().split(" ");
        double A = Double.parseDouble(arr[0]);
        double B = Double.parseDouble(arr[1]);
        double C = Double.parseDouble(arr[2]);
        int first = (int)(A * (B / C));
        int second = (int)((A / B) * C);
        int third = (int)(A /(B * C));
        System.out.print(Math.max(third, Math.max(first, second)));
    }
}