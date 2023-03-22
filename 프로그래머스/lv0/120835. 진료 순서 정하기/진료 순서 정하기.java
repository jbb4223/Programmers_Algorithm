import java.util.Arrays;
import java.util.Collections;
class Solution {
    public int[] solution(int[] emergency) {
Integer[] sort = Arrays.stream(emergency).boxed().toArray(Integer[]::new);
        int[] answer = new int[emergency.length];

        Arrays.sort(sort, Collections.reverseOrder());

        for(int i=0; i< answer.length; i++) {
            for(int j=0; j<sort.length; j++) {
                if(emergency[i] == sort[j]) {
                    answer[i] = j+1;
                }
            }
        }


        return answer;
    }
}