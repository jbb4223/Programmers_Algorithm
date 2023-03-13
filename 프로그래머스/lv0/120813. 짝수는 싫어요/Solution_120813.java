import java.util.Arrays;

public class Solution_120813 {

    public static void main(String[] args) {
        // 예시
        System.out.println("=======================");
        System.out.println(Arrays.toString(solution(10)));
        System.out.println("=======================");
    }

    public static int[] solution(int n) {
        int a = 0;
        int[] answer;
        
        if(n%2 == 0) {
            answer = new int[n/2];
        } else {
            answer = new int[n/2 + 1];
        }
        
        for(int i=1; i<=n; i++) {
            if(i % 2 == 1) {
                answer[a] = i;
                a++;
            }
        }
        
        return answer;
    }
}