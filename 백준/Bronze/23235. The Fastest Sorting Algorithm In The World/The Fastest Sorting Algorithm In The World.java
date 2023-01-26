import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int k = 0;
        String[] numArr = br.readLine().split(" ");
        while(Integer.parseInt(numArr[0]) != 0) {
            k++;
            System.out.println("Case " + k + ": Sorting... done!");
            numArr = br.readLine().split(" ");
        }
    }
}