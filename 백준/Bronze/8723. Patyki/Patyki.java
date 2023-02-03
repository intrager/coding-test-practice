import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());
        double c = Double.parseDouble(st.nextToken());

        double A = Math.pow(a, 2);
        double B = Math.pow(b, 2);
        double C = Math.pow(c, 2);
        if(C == A + B || B == A + C || A == B + C) 
            System.out.print(1);
        else if(a == b && b == c)
            System.out.print(2);
        else
            System.out.print(0);
    }
}