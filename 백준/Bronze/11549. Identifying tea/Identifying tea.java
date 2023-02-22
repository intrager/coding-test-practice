import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        int count = 0;
        String[] contestants = br.readLine().split(" ");
     
        for(int i = 0; i < contestants.length; i++) {
            if(T == Integer.parseInt(contestants[i])) count++;
        }
        System.out.print(count);
    }
}