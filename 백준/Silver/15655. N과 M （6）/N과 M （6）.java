import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    
    static void input() {
        FastReader scan = new FastReader();
        N = scan.nextInt();
        M = scan.nextInt();
        nums = new int[N+1];
        for(int i = 1; i <= N; i++) nums[i] = scan.nextInt();
        Arrays.sort(nums);
        selected = new int[M+1];
        used = new int[N+1];
    }
    
    static int N, M;
    static int[] nums, selected, used;
    
    static void recFunc(int k, int start) {
        if(k == M + 1) {
            for(int i = 1; i <= M; i++) sb.append(selected[i]).append(' ');
            sb.append('\n');
        } else {
            for(int cand = start; cand <= N; cand++) {
                if(used[cand] == 1) continue;
                selected[k] = nums[cand]; used[cand] = 1;
                
                recFunc(k + 1, cand);
                
                selected[k] = 0; used[cand] = 0;
            }
        }
    }
    
    public static void main(String[] args) {
        input();
        
        recFunc(1,1);
        System.out.println(sb.toString());
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