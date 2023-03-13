public class Solution_120908 {

    public static void main(String[] args) {
        // 예시
        System.out.println("=======================");
        System.out.println(solution("ppprrrogrammers", "pppp"));
        System.out.println("=======================");
    }

    public static int solution(String str1, String str2) {
        int answer = 0;

        answer = str1.contains(str2) ? 1 : 2;

        return answer;
    }
}