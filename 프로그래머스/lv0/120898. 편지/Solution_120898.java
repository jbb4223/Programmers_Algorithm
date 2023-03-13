public class Solution_120898 {

    public static void main(String[] args) {
        // 예시
        System.out.println("=======================");
        System.out.println(solution("I love you~"));
        System.out.println("=======================");
    }

    public static int solution(String message) {
        int answer = 0;
        
        answer += message.length() * 2;
        
        return answer;
    }
}