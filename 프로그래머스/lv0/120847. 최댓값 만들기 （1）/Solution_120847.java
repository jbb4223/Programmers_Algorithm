import java.util.Arrays;

public class Solution_120847 {

    public static void main(String[] args) {
        // 예시
        int[] arr = {12,10,1,7,2};
        System.out.println("=======================");
        System.out.println(solution(arr));
        System.out.println("=======================");
    }

    public static int solution(int[] numbers) {
        int answer = 0;
        
        // numbers int 배열 오름차순으로 정렬
        Arrays.sort(numbers);
        
        answer = numbers[numbers.length -1] * numbers[numbers.length -2]; 
        
        return answer;
    }
}