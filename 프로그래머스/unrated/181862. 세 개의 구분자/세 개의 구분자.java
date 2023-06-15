import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] arr =  myStr.split("a|b|c");
        if(arr.length == 0) return new String[]{"EMPTY"};

        List<String> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].isEmpty()) continue;
            list.add(arr[i]);
        }
        return list.toArray(new String[list.size()]);
    }
}