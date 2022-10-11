import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    
    static void input() {
        FastReader scan = new FastReader();
        N = scan.nextInt();
        nums = new int[N + 1]; // N 길이의 배열 초기화
        operators = new int[5]; // 연산자는 4가지(총 길이 5개)
        order = new int[N + 1]; // 기록을 저장할 배열
        for(int i = 1; i <= N; i++) nums[i] = scan.nextInt();
        for(int i = 1; i <= 4; i++) operators[i] = scan.nextInt();
        
        // 정답을 갱신할 변수
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
    }

    static int N, max, min;
    static int[] nums, operators, order;
    
    // 정한 연산자 순서대로(완성된 식에 맞게) 계산해서 정답을 갱신하기
    static int calculator() {
        // nums, order
        int value = nums[1]; //처음 들고있는 숫자는 첫 번째 숫자
        for(int i = 1; i <= N - 1; i++) {
            // value order[i] nums[i+1]
            if(order[i] == 1) // +
                value = value + nums[i + 1];
            if(order[i] == 2) // -
                value = value - nums[i + 1];
            if(order[i] == 3) // *
                value = value * nums[i + 1];
            if(order[i] == 4) // /
                value = value / nums[i + 1];
        }
        return value;
    }
    // order[1...N-1]에 연산자들이 순서대로 저장될 것이다.
    static void recFunc(int k) {
        if(k == N) {    // 모든 연산자들을 전부 나열하는 방법을 찾은 상태
            int value = calculator();
            max = Math.max(max, value);
            min = Math.min(min, value);
        } else {    // k 번째 연산자는 무엇을 선택할 것인가?
            // 4가지의 연산자들 중에 뭘 쓸 것인지 선택하고 재귀호출하기
            for(int cand = 1; cand <= 4; cand++) {
                if(operators[cand] >= 1) { // 해당 사용될 4칙연산이 최소 1개 있으면
                    operators[cand]--;    // 사용했다를 기록
                    order[k] = cand; // order에다가 cand번째 4칙연산을 썼다
                    recFunc(k+1);
                    operators[cand]++; // cand번 사용된 연산자의 횟수 다시 복구(사용했다는 사실 취소)
                    order[k] = 0;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        input();
        // 1번째 원소부터 M번째 원소를 조건에 맞게 고르는 모든 방법 탐색
        recFunc(1);
        sb.append(max).append('\n').append(min);
        System.out.println(sb.toString());
    }
    
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        
        public FastReader () {
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