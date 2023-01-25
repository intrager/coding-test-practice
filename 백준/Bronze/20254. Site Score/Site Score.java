import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] contestScoreArr = br.readLine().split(" ");
        int Ur = Integer.parseInt(contestScoreArr[0]);
        int Tr = Integer.parseInt(contestScoreArr[1]);
        int Uo = Integer.parseInt(contestScoreArr[2]);
        int To = Integer.parseInt(contestScoreArr[3]);
        System.out.println(Ur*56 + Tr*24 + Uo*14 + To*6);
    }
}