import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int length, width;
        while(n-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            width = Integer.parseInt(st.nextToken());
            length = Integer.parseInt(st.nextToken());
            for(int i = 0; i < length; i++) {
                for(int j = 0; j < width; j++) {
                    System.out.print("X");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}