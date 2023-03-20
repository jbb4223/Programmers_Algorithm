import java.util.Arrays;

public class Solution_120905 {

    public static void main(String[] args) {
        // 예시
        int[] arr = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println("=======================");
        System.out.println(Arrays.toString(solution(3, arr)));
        System.out.println("=======================");
    }

    public static int[] solution(int n, int[] numlist) {
        int[] answer = {};

        answer = Arrays.stream(numlist).filter(value -> value % n == 0).toArray();

        return answer;
    }
}