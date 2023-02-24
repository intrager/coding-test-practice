import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int start = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());
    
        int[] jobs = {4, 2, 3, 5};
        
        int changeAllPositions = getLCM(jobs);
        
        int limit = start;
        while(limit <= end) {
            System.out.println("All positions change in year " + limit);
            limit += changeAllPositions;
        }
    }
    
    private static int getLCM(int[] arr) {
        if(arr.length == 1)
            return arr[0];
        
        int gcd = getGCD(arr[0], arr[1]);
        int lcm = (arr[0] * arr[1]) / gcd;
        
        for(int i = 2; i < arr.length; i++) {
            gcd = getGCD(lcm, arr[i]);
            lcm = (lcm * arr[i]) / gcd;
        }
        return lcm;
    }
    
    private static int getGCD(int num1, int num2) {
        if(num1 % num2 == 0)
            return num2;
        
        return getGCD(num2, num1 % num2);
    }
}