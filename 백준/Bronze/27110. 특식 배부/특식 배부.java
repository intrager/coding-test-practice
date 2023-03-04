import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int fried = Integer.parseInt(st.nextToken());
        int seasoning = Integer.parseInt(st.nextToken());
        int soy = Integer.parseInt(st.nextToken());
        int sum = 0;
        
        sum += fried <= N ? fried : N;
        sum += seasoning <= N ? seasoning : N;
        sum += soy <= N ? soy : N;
        System.out.print(sum);
    }
}