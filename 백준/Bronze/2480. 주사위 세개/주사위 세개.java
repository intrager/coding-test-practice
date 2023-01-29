import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] dice = br.readLine().split(" ");
        int A = Integer.parseInt(dice[0]);
        int B = Integer.parseInt(dice[1]);
        int C = Integer.parseInt(dice[2]);
        if(A == B && A == C) System.out.println(10000 + A*1000);
        else if(A == B || A == C || B == C) {
            if(A == B || A == C) {
                System.out.println(1000 + A * 100);
                return;
            } else if(B == C) {
                System.out.println(1000 + B * 100);
            }
        } else {
            int max = 0;
            for(int i = 0; i < 3; i++) {
                max = Math.max(max, Integer.parseInt(dice[i]));
            }
            System.out.println(max*100);
        }
    }
}