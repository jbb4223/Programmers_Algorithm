import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        // array int 배열 오름차순 정렬
        Arrays.sort(array);
        
        answer = array[array.length / 2];
        
        return answer;
    }
}