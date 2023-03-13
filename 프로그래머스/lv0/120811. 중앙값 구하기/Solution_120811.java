import java.util.Arrays;

public class Solution_120811 {

    public static void main(String[] args) {
        // 예시
        int[] arr = {0,12,22,13,5,1};
        System.out.println("=======================");
        System.out.println(solution(arr));
        System.out.println("=======================");
    }

    public static int solution(int[] array) {
        int answer = 0;

        // array int 배열 오름차순 정렬
        Arrays.sort(array);

        answer = array[array.length / 2];

        return answer;
    }
}