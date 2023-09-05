import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        
        while(T-- > 0) {
            String[] arr = br.readLine().split(" ");
            int group = Integer.parseInt(arr[0]);
            int initialCandies = Integer.parseInt(arr[1]);
            int evolveCandies = Integer.parseInt(arr[2]);
        
            int requiredCandies = evolveCandies - initialCandies;
            int requiredKiloMeters;
            if(group == 1) {
                requiredKiloMeters = requiredCandies;
            } else if(group == 2) {
                requiredKiloMeters = requiredCandies * 3;
            } else {
                requiredKiloMeters = requiredCandies * 5;
            }
            if(requiredKiloMeters <= 0) System.out.println(0);
            else System.out.println(requiredKiloMeters);
        }
    }
}