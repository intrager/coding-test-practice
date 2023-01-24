import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] arrA = br.readLine().split(" ");
        int Ax = Integer.parseInt(arrA[0]);
        int Ay = Integer.parseInt(arrA[1]);
        int Az = Integer.parseInt(arrA[2]);
        
        String[] arrC = br.readLine().split(" ");
        int Cx = Integer.parseInt(arrC[0]);
        int Cy = Integer.parseInt(arrC[1]);
        int Cz = Integer.parseInt(arrC[2]);
        
        System.out.println((Cx-Az) + " " + (Cy/Ay) + " " + (Cz-Ax));
    }
}