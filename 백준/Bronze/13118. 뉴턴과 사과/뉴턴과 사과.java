import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] people = new int[4];
        for(int i = 0; i < people.length; i++)
            people[i] = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine(), " ");
        int x = Integer.parseInt(st.nextToken());
        for(int i = 0; i < people.length; i++) {
            if(people[i] == x) {
                System.out.print(i+1);
                return;
            }
        }
        System.out.print(0);
    }
}