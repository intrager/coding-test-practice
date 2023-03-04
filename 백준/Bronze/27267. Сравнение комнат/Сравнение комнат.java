import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int M = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
        
        if(M > P) System.out.print("M");
        else if (M < P) System.out.print("P");
        else System.out.print("E");
    }
}