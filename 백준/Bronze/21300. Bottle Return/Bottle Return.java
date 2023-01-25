import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] bottleArr = br.readLine().split(" ");
        int sum = 0;
        for(int i = 0; i < bottleArr.length; i++) {
            sum += Integer.parseInt(bottleArr[i]) * 5; 
        }
        System.out.println(sum);
    }
}