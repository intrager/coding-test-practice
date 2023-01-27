import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        while(n-- > 0) {
            sum += Integer.parseInt(br.readLine());
        }
        System.out.print(sum);
    }
}