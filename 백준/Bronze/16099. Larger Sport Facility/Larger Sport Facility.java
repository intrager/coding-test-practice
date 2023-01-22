import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0) {
            String[] lengthAndWidth = br.readLine().split(" ");
            long lt = Long.parseLong(lengthAndWidth[0]);
            long wt = Long.parseLong(lengthAndWidth[1]);
            long le = Long.parseLong(lengthAndWidth[2]);
            long we = Long.parseLong(lengthAndWidth[3]);
            long telecomParisTech = lt*wt;
            long eurecom = le*we;
            if(telecomParisTech > eurecom) {
                System.out.println("TelecomParisTech");
            } else if (telecomParisTech == eurecom) {
                System.out.println("Tie");
            } else {
                System.out.println("Eurecom");
            }
        }
    }
}