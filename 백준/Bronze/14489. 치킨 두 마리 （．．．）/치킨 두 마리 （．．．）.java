import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int one = Integer.parseInt(st.nextToken());
        int two = Integer.parseInt(st.nextToken());
        int chicken = Integer.parseInt(br.readLine());
        
        if(one + two >= chicken*2) {
            System.out.print(one+two-(chicken*2));
        } else {
            System.out.print(one+two);
        }
    }
}