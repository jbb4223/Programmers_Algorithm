public class Solution_120849 {

    public static void main(String[] args) {
        // 예시
        System.out.println("=======================");
        System.out.println(solution("bus"));
        System.out.println("=======================");
    }

    public static String solution(String my_string) {
        String answer = "";

        answer = my_string.replaceAll("[aeiou]","");

        return answer;
    }
}