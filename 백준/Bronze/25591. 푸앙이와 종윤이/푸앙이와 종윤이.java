import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] arr = br.readLine().split(" ");
        int x = Integer.parseInt(arr[0]);
        int y = Integer.parseInt(arr[1]);
        
        int a = 100 - x;
        int b = 100 - y;
        int c = 100 - (a + b), d = a * b; 
        int q = d / 100, r = d % 100;
        int front = 0, back = 0;
        if(a * b < 100) {
            front = c;
            back = d;
        } else {
            front = c + q;
            back = r;
        }
        
        System.out.println(a + " " + b + " " + c + " " + d + " " + q + " " + r);
        System.out.print(front + " " + back);
    }
}