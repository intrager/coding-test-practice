import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] numArr = br.readLine().split(" ");
        int[] arr = new int[3];
        
        for(int i = 0; i < numArr.length; i++) {
            arr[i] = Integer.parseInt(numArr[i]);
        }
        Arrays.sort(arr);
        for(int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print(arr[arr.length-1]);
    }
}