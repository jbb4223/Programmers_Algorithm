public class Solution_120807 {

    public static void main(String[] args) {
        // 예시
        System.out.println("=======================");
        System.out.println(solution(1,2));
        System.out.println("=======================");
    }

    public static int solution(int num1, int num2) {
        int answer = 0;
        
        answer = num1 == num2 ? 1 : -1;
        
        return answer;
    }
}