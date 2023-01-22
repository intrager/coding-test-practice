import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] arrForInput = br.readLine().split(" ");
        int N = Integer.parseInt(arrForInput[0]);
        int M = Integer.parseInt(arrForInput[1]);
        int K = Integer.parseInt(arrForInput[2]);
    
        int crowdNumber = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                if(crowdNumber == K) {
                    System.out.println(i + " " + j);
                    return;
                }
                crowdNumber++;
            }
        }
    }
}