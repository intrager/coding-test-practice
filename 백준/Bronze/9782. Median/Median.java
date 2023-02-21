import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int[] nums;
        int k = 0, sum = 0;
        double average;
        
        while(n != 0) {
            k++;
            nums = new int[n];
            
            for(int i = 1; i < arr.length; i++) {
                nums[i-1] = Integer.parseInt(arr[i]);
            }
            if(n % 2 == 1)
                sum = nums[nums.length/2]*2;
            else
                sum = nums[nums.length/2] + nums[nums.length/2-1];
            average = sum / 2.0;
            System.out.print("Case " + k + ": ");
            System.out.printf("%.1f\n", average);
            
            arr = br.readLine().split(" ");
            n = Integer.parseInt(arr[0]);
        }
    }
}