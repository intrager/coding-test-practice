import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] visitScoreArr = br.readLine().split(" ");
        String[] homeScoreArr = br.readLine().split(" ");
        int visitScore = Integer.parseInt(visitScoreArr[0]) * 6 
            + Integer.parseInt(visitScoreArr[1]) * 3 
            + Integer.parseInt(visitScoreArr[2]) * 2 
            + Integer.parseInt(visitScoreArr[3]) + Integer.parseInt(visitScoreArr[4]) * 2;
        int homeScore = Integer.parseInt(homeScoreArr[0]) * 6 
            + Integer.parseInt(homeScoreArr[1]) * 3 
            + Integer.parseInt(homeScoreArr[2]) * 2 
            + Integer.parseInt(homeScoreArr[3]) + Integer.parseInt(homeScoreArr[4]) * 2;
        System.out.println(visitScore + " " + homeScore);
    }
}