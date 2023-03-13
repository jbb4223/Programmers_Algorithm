import java.util.Arrays;

public class Solution_120821 {

    public static void main(String[] args) {
        // 예시
        int[] arr = {0,1,2,3,4,5};
        System.out.println("=======================");
        System.out.println(Arrays.toString(solution(arr)));
        System.out.println("=======================");
    }

    public static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        
        for(int i=num_list.length-1, j=0; i>=0; i--, j++) {
            answer[j] = num_list[i];
        }
        
        return answer;
    }
}