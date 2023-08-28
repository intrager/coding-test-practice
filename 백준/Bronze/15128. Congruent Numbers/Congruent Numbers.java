import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] arr = br.readLine().split(" ");
        double p1 = Double.parseDouble(arr[0]);
        double q1 = Double.parseDouble(arr[1]);
        double p2 = Double.parseDouble(arr[2]);
        double q2 = Double.parseDouble(arr[3]);
        
        double area = (p1 * p2) / (q1 * q2);
        System.out.print(area % 2 == 0 ? 1 : 0);
    }
}