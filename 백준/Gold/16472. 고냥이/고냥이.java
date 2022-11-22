import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();
    
    static int N, kind;
    static String A;
    static int[] cnt;
    
    static void input() {
        N = scan.nextInt();
        A = scan.nextLine();
        cnt = new int[26];
    }
    
    static void add(char x) {
        cnt[x-'a']++;
    }
    
    static void erase(char x) {
        cnt[x-'a']--;
    }
    
    static void pro() {
        int len = A.length(), answer = 0;
        for(int R = 0, L = 0; R < len; R++) {
            add(A.charAt(R));
           
            while(true) {
                kind = 0;
                for(int i = 0; i < 26; i++) {
                    if(cnt[i] != 0) kind++;
                }
                if(kind <= N) break;
                erase(A.charAt(L));
                L++;
            }
            answer = Math.max(answer, R - L + 1);
        }
        System.out.println(answer);
    }
    
    public static void main(String[] args) {
        input();
        pro();
    }
    
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        
        public FastReader(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(new File(s)));
        }
        
        String next() {
            while(st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        
        int nextInt() {
            return Integer.parseInt(next());
        }
        
        long nextLong() {
            return Long.parseLong(next());
        }
        
        double nextDouble() {
            return Double.parseDouble(next());
        }
        
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}