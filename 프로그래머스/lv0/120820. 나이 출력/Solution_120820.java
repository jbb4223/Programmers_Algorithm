public class Solution_120820 {

    public static void main(String[] args) {
        // 예시
        System.out.println("=======================");
        System.out.println(solution(29));
        System.out.println("=======================");
    }

    public static int solution(int age) {
        int answer = 0;
        
        answer = 2022 - age + 1;
        
        return answer;
    }
}