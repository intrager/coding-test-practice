class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        if(Integer.compare(n, m) == 1) {
            if(ineq.equals(">")) return 1;
            else return 0;
        } else if (Integer.compare(n, m) == 0) {
            if(eq.equals("=")) return 1;
            else return 0;
        } else {
            if(ineq.equals("<")) return 1;
            else return 0;
        }
    }
}