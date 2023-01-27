import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        
        double d = 0;
        double f = 0;
        double p = 0;
        double sum = 0;
        
        StringTokenizer st;
        while(n-- > 0) {
            st = new StringTokenizer(br.readLine());
            
            d = Double.parseDouble(st.nextToken());
            f = Double.parseDouble(st.nextToken());
            p = Double.parseDouble(st.nextToken());
            sum = d * f * p * 100;
            bw.write("$");
            bw.write(String.format("%.2f",Math.round(sum) / 100.0));
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}