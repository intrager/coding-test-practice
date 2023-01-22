import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        int t = 0;
        if(L % 5 == 0) {
            t = L / 5;
        } else {
            t = L / 5 + 1;
        }
        System.out.println(t);
        br.close();
    }
}