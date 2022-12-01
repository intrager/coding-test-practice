class Solution {
    boolean solution(String s) {
        int p_cnt = 0, y_cnt = 0;
        s = s.toLowerCase();
        char[] ch = s.toCharArray();
        for(int i = 0; i < ch.length; i++) {
            if(ch[i] == 'p') p_cnt++;
            else if(ch[i] == 'y') y_cnt++;
        }
        return p_cnt == y_cnt ? true : false;
    }
}