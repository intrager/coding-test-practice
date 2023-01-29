import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < N; i++) {
            for(int j = i + 1; j < N; j++) {
                System.out.print(" ");
            }
            for(int k = N - i - 1; k < N; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}