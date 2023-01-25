import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] ratsArr = br.readLine().split(" ");
        int n1 = Integer.parseInt(ratsArr[0]);
        int n2 = Integer.parseInt(ratsArr[1]);
        int n12 = Integer.parseInt(ratsArr[2]);
        System.out.println(((n1+1)*(n2+1)/(n12+1))-1);
    }
}