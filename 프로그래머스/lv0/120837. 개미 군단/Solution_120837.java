public class Solution_120837 {

    public static void main(String[] args) {
        // 예시
        System.out.println("=======================");
        System.out.println(solution(999));
        System.out.println("=======================");
    }

    public static int solution(int hp) {
        int answer = 0;
        
        answer += hp / 5;
        answer += (hp % 5) / 3;
        answer += ((hp % 5) % 3) / 1;
        
        return answer;
    }
}