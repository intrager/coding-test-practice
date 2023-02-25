import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int x;
        while(n-- > 0) {
            x = Integer.parseInt(br.readLine());
            if(x % 2 == 0) System.out.println(x + " is even");
            else System.out.println(x + " is odd");
        }
    }
}