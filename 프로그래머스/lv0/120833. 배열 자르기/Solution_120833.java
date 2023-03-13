import java.util.Arrays;

public class Solution_120833 {

    public static void main(String[] args) {
        // 예시
        int[] arr = {12,10,1,2,3};
        System.out.println("=======================");
        System.out.println(solution(arr, 1,3));
        System.out.println("=======================");
    }

    public static int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};
        
        answer = Arrays.copyOfRange(numbers, num1, num2 + 1);
        
        return answer;
    }
}