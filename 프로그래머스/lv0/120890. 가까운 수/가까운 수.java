import java.util.Arrays;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int [] diff = new int[array.length];
        int minIndex = 0;
        int min;

        Arrays.sort(array);
        
        for(int i=0; i<array.length; i++) {
            diff[i] = Math.abs(n - array[i]);
        }

        min = diff[minIndex];

        for(int j=0; j<diff.length; j++) {
            if(min > diff[j]) {
                min = diff[j];
                minIndex = j;
            }
        }
        answer = array[minIndex];


        return answer;
    }
}