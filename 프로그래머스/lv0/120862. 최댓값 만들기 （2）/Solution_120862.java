import java.util.Arrays;

public class Solution_120862 {

    public static void main(String[] args) {
        // 예시
        int[] arr = {-10, 10, -30, 5, 5, 20, 5};
        System.out.println("=======================");
        System.out.println(solution(arr));
        System.out.println("=======================");
    }

    public static int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);

        int sumA = numbers[0] * numbers[1];
        int sumB = numbers[numbers.length-1] * numbers[numbers.length-2];

        answer = Math.max(sumA, sumB);

        return answer;
    }
}