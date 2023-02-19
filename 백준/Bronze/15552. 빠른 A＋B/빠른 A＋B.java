import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            String str = br.readLine();
            int target = str.indexOf(" ");
            sb.append(Integer.parseInt(str.substring(0, target))+Integer.parseInt(str.substring(target+1))).append('\n');
        }
        br.close();
        System.out.print(sb);
    }
}