import java.util.Arrays;

public class Solution_120824 {

    public static void main(String[] args) {
        // 예시
        int[] arr = {0,1,2,1,1,1};
        System.out.println("=======================");
        System.out.println(Arrays.toString(solution(arr)));
        System.out.println("=======================");
    }

    public static int[] solution(int[] num_list) {
        int[] answer = new int[2];
        
        int even = 0;
        int odd = 0;
        
        for(int num : num_list) {
            if(num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        
        answer[0] = even;
        answer[1] = odd;
        
        return answer;
    }
}