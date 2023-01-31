import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        System.out.println("Gnomes:");
        for(int i = 1; i <= N; i++) {
            int[] gnomes = new int[3];
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < 3; j++) {
                gnomes[j] = Integer.parseInt(st.nextToken());
            }
            if(gnomes[0] >= gnomes[1]) {
                if(gnomes[1] >= gnomes[2]) {
                    System.out.println("Ordered");
                } else {
                    System.out.println("Unordered");
                }
            } else { // gnomes[0] <= gnomes[1]
                if(gnomes[1] <= gnomes[2]) {
                    System.out.println("Ordered");
                } else {
                    System.out.println("Unordered");
                }
            }
        }
    }
}