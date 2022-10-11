import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    
    static void input() {
        FastReader scan = new FastReader();
        N = scan.nextInt();
        nums = new int[N + 1]; // N 길이의 배열 초기화
        operators = new int[5]; // 연산자는 4가지(총 길이 5개)
        for(int i = 1; i <= N; i++) nums[i] = scan.nextInt();
        for(int i = 1; i <= 4; i++) operators[i] = scan.nextInt();
        
        // 정답을 갱신할 변수
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
    }

    static int N, max, min;
    static int[] nums, operators;
    
    // 피연산자 2개와 연산자 1개가 주어졌을 때 계산해주는 함수
    static int calculator(int operand1, int operator, int operand2) {
        if(operator == 1) // +
            return operand1 + operand2;
        else if(operator == 2) // -
            return operand1 - operand2;
        else if(operator == 3) // *
            return operand1 * operand2;
        else // /
            return operand1 / operand2;
    }
    // k - 1번째 연산자까지 계산한 결과가 value임
    static void recFunc(int k, int value) {
        if(k == N) {    // 모든 연산자들을 전부 나열하는 방법을 찾은 상태
            // value를 정답에 갱신
            max = Math.max(max, value);
            min = Math.min(min, value);
        } else {    // k 번째 연산자는 무엇을 선택할 것인가?
            // 4가지의 연산자들 중에 뭘 쓸 것인지 선택하고 재귀호출하기
            for(int cand = 1; cand <= 4; cand++) {
                if(operators[cand] >= 1) { // 해당 사용될 4칙연산이 최소 1개 있으면
                    operators[cand]--;    // 사용했다를 기록
                    // 지금의 중간계산값과 연산자, 다음(새로운) 숫자
                    recFunc(k + 1, calculator(value, cand, nums[k+1]));
                    operators[cand]++; // cand번 사용된 연산자의 횟수 다시 복구(사용했다는 사실 취소)
                }
            }
        }
    }
    
    public static void main(String[] args) {
        input();
        // 1번째 원소부터 M번째 원소를 조건에 맞게 고르는 모든 방법 탐색
        recFunc(1, nums[1]); // 첫 번째 원소의 계산 결과는 어차피 1번지의 원소값
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
