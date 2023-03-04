import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        br.readLine();
        String JOIG = br.readLine();
        if(JOIG.charAt(JOIG.length()-1) == 'G') {
            System.out.print(JOIG.substring(0, JOIG.length()-1));
        } else {
            System.out.print(JOIG.concat("G"));
        }
    }
}