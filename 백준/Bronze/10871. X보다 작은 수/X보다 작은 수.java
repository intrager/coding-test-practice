import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        // readLine()을 이용해 String 형태로 개행문자(엔터)까지 포함해 한 줄을 통째로 입력받고 split()으로 나눔
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int X = Integer.parseInt(str[1]);
   
        String[] arr = br.readLine().split(" ");
        for(int i = 0; i < N; i++) {
            if(Integer.parseInt(arr[i]) < X) {
                sb.append(Integer.parseInt(arr[i])).append(' ');
            }
        }
        System.out.println(sb);
    }
}