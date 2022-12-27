import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<String, Double> credit = new HashMap<String, Double>();
        credit.put("A+", 4.3);
        credit.put("A0", 4.0);
        credit.put("A-", 3.7);
        credit.put("B+", 3.3);
        credit.put("B0", 3.0);
        credit.put("B-", 2.7);
        credit.put("C+", 2.3);
        credit.put("C0", 2.0);
        credit.put("C-", 1.7);
        credit.put("D+", 1.3);
        credit.put("D0", 1.0);
        credit.put("D-", 0.7);
        credit.put("F", 0.0);
        
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        scan.close();
        System.out.println(credit.get(s));
    }
}