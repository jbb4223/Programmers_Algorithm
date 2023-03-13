import java.util.Arrays;

public class Solution_120847 {
    public int solution(int[] numbers) {
        int answer = 0;
        
        // numbers int 배열 오름차순으로 정렬
        Arrays.sort(numbers);
        
        answer = numbers[numbers.length -1] * numbers[numbers.length -2]; 
        
        return answer;
    }
}