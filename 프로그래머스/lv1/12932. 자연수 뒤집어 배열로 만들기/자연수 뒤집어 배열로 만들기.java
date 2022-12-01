class Solution {
    public long[] solution(long n) {
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();
        
        long[] ar = new long[sb.length()];
        for(int i = 0; i < sb.length(); i++) {
            ar[i] = Long.parseLong(sb.substring(i, i + 1));
        }
        return ar;
    }
}