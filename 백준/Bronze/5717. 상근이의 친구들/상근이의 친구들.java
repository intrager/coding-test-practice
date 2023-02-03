import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int M = Integer.parseInt(st.nextToken());
        int F = Integer.parseInt(st.nextToken());
        while(M != 0 || F != 0) {
            System.out.println(M+F);
            st = new StringTokenizer(br.readLine(), " ");
            M = Integer.parseInt(st.nextToken());
            F = Integer.parseInt(st.nextToken());
        }
    }
}