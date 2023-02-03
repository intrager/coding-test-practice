import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long x = Long.parseLong(st.nextToken());
        long k = Long.parseLong(st.nextToken());
        long a = 0, b = 0, c = 0;

        // 1. k가 맨 위에 있을 때
        if(7000 * k <= 1000 * x)
            a = k * 7000;
        // 2. k가 중간에 있을 때
        if(3500 * k <= 1000 * x)
            b = k * 3500;
        // 3. k가 맨 위에 있을 때
        if(1750 * k <= 1000 * x)
            c = k * 1750;
        System.out.print(Math.max(a, Math.max(b, c)));
    }
}