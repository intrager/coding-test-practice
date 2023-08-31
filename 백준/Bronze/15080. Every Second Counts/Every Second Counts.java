import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] arr1 = br.readLine().split(" : ");
        String[] arr2 = br.readLine().split(" : ");
        
        int hour1 = Integer.parseInt(arr1[0]), hour2 = Integer.parseInt(arr2[0]);
        int minute1 = Integer.parseInt(arr1[1]), minute2 = Integer.parseInt(arr2[1]);
        int second1 = Integer.parseInt(arr1[2]), second2 = Integer.parseInt(arr2[2]);
        
        
        int hour = hour2 - hour1 < 0 ? hour2 - hour1 + 24 : hour2 - hour1;
        int minute = 0;
        if(minute < 0) {
            minute += 60;
            hour -= 1;
        } else {
            minute = minute2 - minute1;
        }
        int second = 0;
        if(second < 0) {
            second += 60;
            minute -= 1;
        } else {
            second = second2 - second1;
        }
        int sum = hour * 3600 + minute * 60 + second;
        if(sum < 0) sum += 60 * 60 * 24; 
        System.out.print(sum);
    }
}