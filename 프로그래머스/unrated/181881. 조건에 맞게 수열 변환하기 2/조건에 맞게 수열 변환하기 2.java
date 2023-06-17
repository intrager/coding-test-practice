import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int answer = 0, cnt = 0;
        int[] intArr = {};
        while(!Arrays.equals(arr, intArr)) {
            intArr = Arrays.copyOf(arr, arr.length);
            cnt++;
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] = arr[i] / 2;
                } else if(arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = arr[i] * 2 + 1;
                } else continue;
            }
        }
        return cnt-1;
    }
}