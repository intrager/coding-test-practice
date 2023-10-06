import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int apple = 0;
        int banana = 0;
        apple += Integer.parseInt(br.readLine()) * 3;
        apple += Integer.parseInt(br.readLine()) * 2;
        apple += Integer.parseInt(br.readLine()) * 1;
        
        banana += Integer.parseInt(br.readLine()) * 3;
        banana += Integer.parseInt(br.readLine()) * 2;
        banana += Integer.parseInt(br.readLine()) * 1;
        
        if(apple == banana) System.out.print('T');
        else if(apple > banana) System.out.print('A');
        else System.out.print('B');
    }
}