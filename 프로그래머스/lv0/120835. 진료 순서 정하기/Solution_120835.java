import java.util.Arrays;
import java.util.Collections;
public class Solution_120835 {

    public static void main(String[] args) {
        // 예시
        int [] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("=======================");
        System.out.println(Arrays.toString(solution(arr)));
        System.out.println("=======================");
    }

    public static int[] solution(int[] emergency) {
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