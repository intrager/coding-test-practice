import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int participant, strategy, itsm, tech, sum;
        while(N-- > 0) {
            String[] participants = br.readLine().split(" ");
            participant = Integer.parseInt(participants[0]);
            strategy = Integer.parseInt(participants[1]);
            itsm = Integer.parseInt(participants[2]);
            tech = Integer.parseInt(participants[3]);
            sum = strategy + itsm + tech;
            if(strategy >= 11 && itsm >= 8 && tech >= 12 && sum >= 55) {
                System.out.println(participant + " " + sum + " " + "PASS");
            } else {
                System.out.println(participant + " " + sum + " " + "FAIL");
            }
        }
    }
}