import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int D = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        // D - 11 -> 남은 일 * 24 -> 시간으로 이관
        // H - 11 -> 남은 일 * 24 + H - 11 -> 분으로 이관
        // M - 11 -> 남은 시간 * 60 + M - 11
        if((D - 11) * 24 * 60 + (H - 11) * 60 + M - 11 < 0) System.out.print(-1);
        else System.out.print((D - 11) * 24 * 60 + (H - 11) * 60 + M - 11);
    }
}