import java.util.Arrays;

public class Solution_120850 {

    public static void main(String[] args) {
        // 예시
        System.out.println("=======================");
        System.out.println(Arrays.toString(solution("hi12392")));
        System.out.println("=======================");
    }

    public static int[] solution(String my_string) {
        int[] answer = Arrays.stream(my_string.split(""))
                             .filter(e -> e.matches("[0-9]"))
                             .mapToInt(Integer::parseInt)
                             .sorted()
                             .toArray();

        return answer;
    }
}