import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] arr = new int[4];
        for(int i = 0; i < 4; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        if((arr[0] == 9 || arr[0] == 8) && (arr[3] == 9 || arr[3] == 8)) {
            if(arr[1] == arr[2]) System.out.print("ignore");
            else System.out.print("answer");
        } else {
            System.out.print("answer");
        }
    }
}