public class Solution_120888 {

    public static void main(String[] args) {
        // 예시
        System.out.println("=======================");
        System.out.println(solution("We are the world"));
        System.out.println("=======================");
    }

    public static String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        char [] arr = my_string.toCharArray();

        for (char c : arr) {
            if (!answer.toString().contains(String.valueOf(c))) {
                answer.append(c);
            }
        }

        return answer.toString();
    }
}