import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        double N = Double.parseDouble(br.readLine());
        while(N != 0) {
            double procession = N*N*N*N + N*N*N + N*N + N + 1;
            System.out.println(String.format("%.2f", procession));
            N = Double.parseDouble(br.readLine());
        } 
    }
}