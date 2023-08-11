import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] birthday = br.readLine().split(" ");
        String[] nowDate = br.readLine().split(" ");
        
        int y1 = Integer.parseInt(birthday[0]), m1 = Integer.parseInt(birthday[1]), d1 = Integer.parseInt(birthday[2]);
        int y2 = Integer.parseInt(nowDate[0]), m2 = Integer.parseInt(nowDate[1]), d2 = Integer.parseInt(nowDate[2]);
        
        int year1, year2, year3;
        
        if(m1 < m2) year1 = y2 - y1;
        else if(m1 == m2 && d1 <= d2) year1 = y2 - y1;
        else year1 = y2 - y1 - 1;
        
        year2 = y2 - y1 + 1;
        year3 = y2 - y1;
        
        System.out.println(year1);
        System.out.println(year2);
        System.out.print(year3);
    }
}