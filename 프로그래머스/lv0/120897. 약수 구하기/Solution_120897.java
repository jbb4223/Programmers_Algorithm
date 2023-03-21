import java.util.Arrays;

public class Solution_120897 {

    public static void main(String[] args) {
        // 예시
//        int [] arr = {4, 455, 6, 4, -1, 45, 6};
        System.out.println("=======================");
        System.out.println(Arrays.toString(solution(24)));
        System.out.println("=======================");
    }

    public static int[] solution(int n) {
        int[] answer = {};
        int size = 0;

        for(int i=1; i<=n; i++) {
            if(n % i == 0) {
                size +=1;
            }
        }

        answer = new int[size];

        for(int i=1,j=0; i<=n; i++) {
            if(n % i == 0) {
                answer[j] = i;
                j++;
            }
        }

        return answer;
    }
}