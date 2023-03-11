import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int row = Integer.parseInt(st.nextToken());
        int column = Integer.parseInt(st.nextToken());
                
        for(int i = 0; i < row; i++) {
            String str = br.readLine();
            for(int j = column-1; j >= 0; j--) {
                bw.write(str.charAt(j));
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}