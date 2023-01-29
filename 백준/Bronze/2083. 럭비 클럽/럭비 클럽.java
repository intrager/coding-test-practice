import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] member = br.readLine().split(" ");
        String name = member[0];
        int age = Integer.parseInt(member[1]);
        int weight = Integer.parseInt(member[2]);
        
        while(!member[0].equals("#")) {
            name = member[0];
            age = Integer.parseInt(member[1]);
            weight = Integer.parseInt(member[2]);
            
            if(age > 17 || weight >= 80) {
                bw.write(name + " Senior");
                bw.newLine();
            } else {
                bw.write(name + " Junior");
                bw.newLine();
            }
            bw.flush();
            member = br.readLine().split(" ");
        }
        bw.close();
    }
}