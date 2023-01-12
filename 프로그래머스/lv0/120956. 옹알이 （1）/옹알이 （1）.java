import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        // 문자열 리스트 담을 배열 생성
        List<String[]> list = new ArrayList<>();
        
        for(int i = 0; i < babbling.length; i++) {
            String[] temp = babbling[i].split("aya|ye|woo|ma");
            list.add(temp);
        }
        for(int i = 0; i < babbling.length; i++) {
            int temp = 0; 
            for(String s : list.get(i)) {
                if(!s.equals("")) break;
                temp++;
            }
            if(list.get(i).length == temp) answer++;
        }
        return answer;
    }
}