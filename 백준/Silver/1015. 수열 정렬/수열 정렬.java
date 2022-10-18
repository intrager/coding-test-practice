import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static FastReader scan = new FastReader();
    
    static class Elem implements Comparable<Elem> {
        /**
         * idx : A 배열의 idx 위치를 기억하는 변수 - 어떤 값이냐
         * num : A[idx]의 원래 값 - 어디에 있었냐
         */
        public int num, idx;
        
        @Override
        public int compareTo(Elem other) {
            // 정렬 조건에 맞게 정렬하기
            // 1. num의 비내림차순
            // 2. num이 같으면 idx 오름차순
            return num - other.num;
        }
    }
    
    static int N;
    static int[] P;
    static Elem[] B;
    
    static void input() {
        N = scan.nextInt();
        B = new Elem[N];
        P = new int[N];
        for(int i = 0; i < N; i++) {
            B[i] = new Elem();
            // TODO : Elem의 정의에 맞게 B[i]에 값을 넣어주기
            B[i].num = scan.nextInt();
            B[i].idx = i;
        }
    }
    
    static void pro() {
        // TODO : B 배열 정렬하기
        Arrays.sort(B); // idx는 여기부터 정렬 다 됐음 ㅇㅇ
        
        // TODO : B 배열의 값을 이용해서 P 배열 채우기
        for(int b_idx = 0; b_idx < N; b_idx++) {
            P[B[b_idx].idx] = b_idx;
        }
        
        // TODO : P 배열 출력하기
        for(int i = 0; i < N; i++) {
            sb.append(P[i]).append(' ');
        }
        System.out.println(sb.toString());
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