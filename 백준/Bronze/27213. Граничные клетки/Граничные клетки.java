import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        if(m <= 3 || n <= 3) {
            System.out.print(m*n);    
        } else {
            System.out.print(m*n - (m-2)*(n-2));
        }
    }
}