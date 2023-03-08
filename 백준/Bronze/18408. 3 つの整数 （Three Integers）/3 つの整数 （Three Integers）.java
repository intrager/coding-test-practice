import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        
        int countOne = 0;
        if(A == 1) countOne++;
        if(B == 1) countOne++;
        if(C == 1) countOne++;
        System.out.print(countOne > 1 ? 1 : 2);
    }
}