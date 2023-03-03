import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[][] chess = new int[8][8];
        int cnt = 0;
        for(int i = 1; i <= 8; i++) {
            for(int j = 0; j < 8; j++) {
                cnt++;
                if(N == cnt) {
                    System.out.print(String.valueOf((char)(97+j)) + String.valueOf(i));
                    return;
                }
                chess[8-i][j] = cnt;
            }
        }
    }
}