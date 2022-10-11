import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    
    static void input() {
        FastReader scan = new FastReader();
        N = scan.nextInt();
        col = new int[N+1];
    }
    
    static int N, ans;
    static int[] col; // col[i] : i번 행의 퀸은 col[i]번 열에 놓았다는 기록
    // row번 ~ N번 행에 대해서 가능한 퀸을 놓는 경우의 수 구하기
    
    static boolean attackable(int r1, int c1, int r2, int c2) {
        if(c1 == c2) return true; // 같은 열에 있음
        if(r1 - c1 == r2 - c2) return true; // 왼쪽 위 대각선
        if(r1 + c1 == r2 + c2) return true; // 오른쪽 위 대각선
        return false; // 조건 성립
    }
    
    static boolean checkValidity() {
        for(int i = 1; i <= N; i++) {  // (i, col[i]) // i행 col[i]열
            for(int j = 1; j < i; j++) { // (j, col[j])
                if(attackable(i, col[i], j, col[j])) {
                    return false;
                }
            }
        }
        return true;
    }
    
    static void recFunc(int row) {
        if(row == N + 1) {    // 각 행마다 하나씩 놓음
                ans++;
        } else {
            for(int c = 1; c <= N; c++) {
                boolean possible = true;
                // check validation (row, c)
                for(int i = 1; i <= row - 1; i++) { // (i, col[i])
                    if(attackable(row, c, i, col[i])) { 
                        possible = false;
                        break;
                    }
                }
                if (possible) { // 공격받지 않는다면
                    col[row] = c;
                    recFunc(row+1);
                    col[row] = 0;
                }
            }
        }
    }
    
    
    
    
    public static void main(String[] args) {
        input();

        recFunc(1);
        System.out.println(ans);
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
                } catch(IOException e) {
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