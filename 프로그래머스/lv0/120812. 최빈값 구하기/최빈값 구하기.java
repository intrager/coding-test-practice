class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int maxArr = 0;
        int maxCount = Integer.MIN_VALUE;
        
        for(int i = 0; i < array.length; i++) {
            if(array[i] > maxArr) {
                maxArr = array[i];
            }
        }
        int[] count = new int[maxArr + 1];
        
        for(int j = 0; j < array.length; j++)
            count[array[j]]++;
        
        for(int k = 0; k < count.length; k++) {
            if(count[k] > maxCount) {
                maxCount = count[k];
                answer = k;
            }
        }
        
        int rep = 0;
        for(int l = 0 ; l < count.length; l++) {
            if(maxCount == count[l]) rep++;
        }
        return rep != 1 ? -1 : answer;
    }
}