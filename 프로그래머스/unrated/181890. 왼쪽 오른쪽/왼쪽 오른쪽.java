import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strList) {
        List<String> list = new ArrayList<>();

        for(int i = 0; i < strList.length; i++) {
            if(strList[i].equals("l")) {
                for(int j = 0; j < i; j++) {
                    list.add(strList[j]);
                }
                break;
            } else if (strList[i].equals("r")) {
                for(int j = i + 1; j < strList.length; j++) {
                    list.add(strList[j]);
                }
                break;
            }
        }
        
        return list.toArray(new String[list.size()]);
    }
}