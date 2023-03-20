import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);

        int sumA = numbers[0] * numbers[1];
        int sumB = numbers[numbers.length-1] * numbers[numbers.length-2];

        answer = Math.max(sumA, sumB);

        return answer;
    }
}