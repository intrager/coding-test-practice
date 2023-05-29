class Solution {
    public String solution(String n_str) {
        int cnt = 0;
        for(int i = 0; i < n_str.length(); i++) {
            if(n_str.charAt(i) == '0') cnt++;
            else break;
        }
        return cnt > 0 ? n_str.substring(cnt) : n_str;
    }
}