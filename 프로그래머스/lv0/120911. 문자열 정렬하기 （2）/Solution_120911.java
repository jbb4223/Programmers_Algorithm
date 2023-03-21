import java.util.Arrays;

public class Solution_120911 {

    public static void main(String[] args) {
        // 예시
        System.out.println("=======================");
        System.out.println(solution("Bcad"));
        System.out.println("=======================");
    }


    public static String solution(String my_string) {
        String answer = "";
        String [] arr = my_string.toLowerCase().split("");

        Arrays.sort(arr);

        for(String s : arr) {
            answer += s;
        }

        return answer;
    }
}