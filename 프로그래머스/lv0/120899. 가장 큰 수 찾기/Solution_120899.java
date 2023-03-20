import java.util.Arrays;

public class Solution_120899 {

    public static void main(String[] args) {
        // 예시
        int [] arr = {9, 10, 11, 8};
        System.out.println("=======================");
        System.out.println(Arrays.toString(solution(arr)));
        System.out.println("=======================");
    }

    public static int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = 0;
        int maxIndex = 0;

        for(int i=0; i<array.length; i++) {
            if(max < array[i]) {
                max = array[i];
                maxIndex = i;
            }
        }

        answer[0] = max;
        answer[1] = maxIndex;

        return answer;
    }
}