import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < 5; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        System.out.print(list.get(0) ^ list.get(1) ^ list.get(2) ^ list.get(3) ^ list.get(4));
    }
}