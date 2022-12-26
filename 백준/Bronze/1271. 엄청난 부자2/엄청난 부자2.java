import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
    
    static BigInteger n, m, rest, share;
    static Scanner scan = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    
    static void input() {
        n = scan.nextBigInteger();
        m = scan.nextBigInteger();
    }
    
    static void pro() {
        share = n.divide(m);
        rest = n.remainder(m);
    }
    
    public static void main(String[] args) {
        input();
        pro();
        System.out.println(share);
        System.out.println(rest);
    }
}