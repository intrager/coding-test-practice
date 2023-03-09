import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int A1 = Integer.parseInt(br.readLine());
        int A2 = Integer.parseInt(br.readLine());
        int A3 = Integer.parseInt(br.readLine());
    
        int stair1 = A2*2 + A3*4;
        int stair2 = A1*2 + A3*2;
        int stair3 = A2*2 + A1*4;
        
        System.out.print(Math.min(stair1, Math.min(stair2, stair3)));
    }
}