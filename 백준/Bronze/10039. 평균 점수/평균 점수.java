import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int sum = 0;
        int score = 0;
        for(int i = 0; i < 5; i++) {
            score = Integer.parseInt(br.readLine());
            if(score < 40) score = 40;
            sum += score;
        }
        System.out.print(sum/5);
    }
}