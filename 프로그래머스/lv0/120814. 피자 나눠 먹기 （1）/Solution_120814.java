public class Solution_120814 {

    public static void main(String[] args) {
        // 예시
        System.out.println("=======================");
        System.out.println(solution(15));
        System.out.println("=======================");
    }

    public static int solution(int n) {
        int answer = 0;
        
        answer = n % 7 == 0 ? (n / 7) : (n / 7) + 1;
        
        return answer;
    }
}