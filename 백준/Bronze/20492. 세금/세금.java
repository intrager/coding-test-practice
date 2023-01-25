import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int firstReward = (int) (N * 0.78);
        int secondReward = (int) (N * 0.8) + (int) (N * 0.2 * 0.78);
        System.out.println(firstReward + " " + secondReward);
    }
}