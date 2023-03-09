import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] twoNum = br.readLine().split("");
        if(twoNum.length == 4)
            System.out.print(Integer.parseInt(twoNum[0].concat(twoNum[1])) + Integer.parseInt(twoNum[2].concat(twoNum[3])));
        else if(twoNum.length == 3) {
            if(twoNum[1].equals("0"))
                System.out.print(Integer.parseInt(twoNum[0].concat(twoNum[1])) + Integer.parseInt(twoNum[2]));
            else
                System.out.print(Integer.parseInt(twoNum[0]) + Integer.parseInt(twoNum[1].concat(twoNum[2])));
        }
            
        else
            System.out.print(Integer.parseInt(twoNum[0]) + Integer.parseInt(twoNum[1]));
    }
}