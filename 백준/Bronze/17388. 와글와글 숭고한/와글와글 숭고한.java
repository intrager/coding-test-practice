import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] arr = br.readLine().split(" ");
        int soongsil = Integer.parseInt(arr[0]);
        int korea = Integer.parseInt(arr[1]);
        int hanyang = Integer.parseInt(arr[2]);
        int sum = soongsil + korea + hanyang;
        
        Map<Integer, String> map = new HashMap<>();
        map.put(soongsil, "Soongsil");
        map.put(korea, "Korea");
        map.put(hanyang, "Hanyang");
        int minimum = Math.min(soongsil, Math.min(korea, hanyang));
        
        if(sum >= 100) System.out.print("OK");
        else System.out.print(map.get(minimum));
    }
}