// N개 중 중복 없이
// M개를 순서 있게 나열하기
// 패캠 공부 중입니다

import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    
    static void input() {
        FastReader scan = new FastReader();
        N = scan.nextInt();
        M = scan.nextInt();
        selected = new int[M+1];
        used = new int[N+1];
    }
    
    static int N, M;
    static int[] selected, used;
    
    static void recFunc(int k) {
        if(k == M + 1) { // 1 ~ M번째를 다 골랐을 때
            // selected[1...M] 배열이 새롭게 탐색된 결과
            for(int i = 1; i <= M; i++) sb.append(selected[i]).append(' ');
            sb.append('\n');
        } else {
            for(int cand = 1; cand <= N; cand++) {
                if(used[cand] == 1)continue;
                selected[k]=cand; used[cand]=1;
                
                recFunc(k+1);
                
                selected[k]=0; used[cand]=0;
            }
        }
    }
    
    public static void main(String[] args) {
        input();
        
        recFunc(1);
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