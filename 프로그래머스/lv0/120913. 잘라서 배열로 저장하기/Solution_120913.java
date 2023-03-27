import java.util.Arrays;

public class Solution_120913 {

    public static void main(String[] args) {
        // 예시
        int [] arr = {1, 2, 3};
        System.out.println("=======================");
        System.out.println(Arrays.toString(solution("abcdef123av", 3)));
        System.out.println("=======================");
    }

    public static String[] solution(String my_str, int n) {

            String[] answer = new String[(my_str.length() / n) + ((my_str.length() % n) == 0 ? 0 : 1)];

            for(int i=0; i < answer.length; i++) {
                answer[i] = my_str.substring(i*n , i == answer.length - 1 ? my_str.length() : ((i+1) * n));
            }

            return answer;
    }
}