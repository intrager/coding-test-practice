import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken()) - 1;
        int k = Integer.parseInt(st.nextToken()) - 1;
        int stairs = n * Integer.parseInt(st.nextToken());
        int elevator = (n+k) * Integer.parseInt(st.nextToken());
        System.out.print(elevator + " " + stairs);
    }
}