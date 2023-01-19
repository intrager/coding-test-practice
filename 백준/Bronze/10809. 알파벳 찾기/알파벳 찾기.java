import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chArr = br.readLine().toCharArray();
        int[] arr = new int[26];
        Arrays.fill(arr, -1);
        
        for(int i = 0; i < chArr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if((char)(j + 97) == chArr[i]) {
                    if(arr[j] == -1) {
                        arr[j] = i;
                    }
                    break;
                }
            }
        }
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}