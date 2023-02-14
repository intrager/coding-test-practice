import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int count = 0;
        for(int i = 0; i < 5; i++) {
            if(N - Integer.parseInt(st.nextToken()) == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}