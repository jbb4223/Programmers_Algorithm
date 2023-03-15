import java.util.Arrays;

public class Solution_120819 {

    public static void main(String[] args) {
        // 예시
        int[] arr = {10000};
        System.out.println("=======================");
        System.out.println(Arrays.toString(solution(10000)));
        System.out.println("=======================");
    }

    public static int[] solution(int money) {
        int[] answer = new int[2];
        
        answer[0] = money / 5500;
        answer[1] = money % 5500;
        
        return answer;
    }
}