import java.util.Arrays;

public class Solution_120809 {

    public static void main(String[] args) {
        // 예시
        int[] arr = {0,1,2,1,1,1};
        System.out.println("=======================");
        System.out.println(Arrays.toString(solution(arr)));
        System.out.println("=======================");
    }

    public static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        
        for(int i=0; i<numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        
        return answer;
    }
}