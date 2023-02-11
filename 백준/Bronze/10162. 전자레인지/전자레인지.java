import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        int A = 0, B = 0, C = 0;
        if(T % 10 != 0) {
            System.out.print(-1);
            return;
        } else {
            A = T / 300;
            T %= 300;
            
            B = T / 60;
            T %= 60;
            
            C = T / 10;
            
            System.out.print(A + " " + B + " " + C);
        }
    }
}