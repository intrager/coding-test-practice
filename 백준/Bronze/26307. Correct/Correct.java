import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] time = br.readLine().split(" ");
        int HH = Integer.parseInt(time[0]);
        int MM = Integer.parseInt(time[1]);
        int answer = Math.abs(9 - HH) * 60 + MM;
        System.out.println(answer);
    }
}