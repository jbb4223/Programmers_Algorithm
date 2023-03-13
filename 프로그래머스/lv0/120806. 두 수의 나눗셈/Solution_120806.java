public class Solution_120806 {

    public static void main(String[] args) {
        // 예시
        System.out.println("=======================");
        System.out.println(solution(1,2));
        System.out.println("=======================");
    }

    public static int solution(int num1, int num2) {
        int answer = 0;
        
        answer = (int)((double)num1 / num2 * 1000);
        
        return answer;
    }
}