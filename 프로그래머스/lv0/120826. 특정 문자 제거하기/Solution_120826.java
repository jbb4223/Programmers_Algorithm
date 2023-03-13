import java.util.Arrays;

public class Solution_120826 {

    public static void main(String[] args) {
        // 예시
        System.out.println("=======================");
        System.out.println(solution("strdd","r"));
        System.out.println("=======================");
    }

    public static String solution(String my_string, String letter) {
        String answer = "";
        
        answer = my_string.replaceAll(letter, "");
        
        return answer;
    }
}