import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for(int i = 0; i < 15; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            while(st.hasMoreTokens()) {
                String str = st.nextToken();
                if("w".equals(str)) {
                    System.out.print("chunbae");
                    return;
                } else if("b".equals(str)) {
                    System.out.print("nabi");
                    return;
                } else if("g".equals(str)) {
                    System.out.print("yeongcheol");
                    return;
                }
            }
        }
    }
}