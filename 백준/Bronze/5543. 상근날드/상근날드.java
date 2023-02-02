// 햄 + 음 - 50 == 세트
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int high = Integer.parseInt(br.readLine());
        int medium = Integer.parseInt(br.readLine());
        int low = Integer.parseInt(br.readLine());
        int cola = Integer.parseInt(br.readLine());
        int cider = Integer.parseInt(br.readLine());
    
        int A1 = high + cola;
        int A2 = high + cider;
        int B1 = medium + cola;
        int B2 = medium + cider;
        int C1 = low + cola;
        int C2 = low + cider;
        
        int result = Math.min(A1, Math.min(A2, Math.min(B1, Math.min(B2, Math.min(C1, C2)))));
        System.out.print(result - 50);
    }
}