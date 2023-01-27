import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        while(N-- > 0) {
            String[] product = br.readLine().split(" ");
            int a = Integer.parseInt(product[0]);
            int b = Integer.parseInt(product[1]);
            sum += (a*b);
        }
        if(sum == X) System.out.println("Yes");
        else System.out.println("No");
    }
}