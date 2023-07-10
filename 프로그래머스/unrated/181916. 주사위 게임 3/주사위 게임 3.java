import java.util.Map;
import java.util.List;
import java.util.Arrays;
import java.util.stream.*;
import java.util.function.Function;

class Solution {
    public int solution(int a, int b, int c, int d) {
        Stream<Integer> stream = Stream.of(a, b, c, d);
        
        Map<Integer, Integer> map = stream.collect(Collectors.toMap(Function.identity(), value -> 1, Integer::sum));
        
        List<Integer> keyList = map.keySet()
                                   .stream()
                                   .collect(Collectors.toList());
        
        List<Integer> valueList = map.values()
                                     .stream()
                                     .collect(Collectors.toList());
        
        if(map.size() == 1) {
            int p = keyList.get(0);
            return p * 1111;
        }
        
        else if(map.size() == 2) {
            if(valueList.get(0) == valueList.get(1)) {
                int p = keyList.get(0);
                int q = keyList.get(1);
                return (p + q) * Math.abs(p - q);
            } else {
                int findMaxKey = 0;
                for(Integer key : map.keySet()) {
                    if(map.get(key).equals(3)) {
                        findMaxKey = key;
                        break;
                    }
                }
                int findMinKey = 0;
                for(Integer key : map.keySet()) {
                    if(map.get(key).equals(1)) {
                        findMinKey = key;
                        break;
                    }
                }
                
                int p = findMaxKey;
                int q = findMinKey;
                
                return ((10 * p) + q) * ((10 * p) + q);
            }
        } else if(map.size() == 3) {
            int q, r;
            if(valueList.get(0) == 2) {
                q = keyList.get(1);
                r = keyList.get(2);
            } else if(valueList.get(1) == 2) {
                q = keyList.get(0);
                r = keyList.get(2);
            } else {
                q = keyList.get(0);
                r = keyList.get(1);
            }
            return q * r;
        } else {
            int i[] = {keyList.get(0), keyList.get(1), keyList.get(2), keyList.get(3)};
            Arrays.sort(i);
            return i[0];
        }
    }
}