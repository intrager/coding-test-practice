import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int ds = Integer.parseInt(st.nextToken());
        int ys = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine(), " ");
        int dm = Integer.parseInt(st.nextToken());
        int ym = Integer.parseInt(st.nextToken());
        
        int n = 1;
        while(true) {
            if((n + ds) % ys == 0 && (n + dm) % ym == 0) {
                System.out.print(n);
                break;
            }
            n++;
        }
    }
}