public class Solution_120816 {

    public static void main(String[] args) {
        // 예시
        System.out.println("=======================");
        System.out.println(solution(7, 2));
        System.out.println("=======================");
    }

    public static int solution(int slice, int n) {
        int answer = 0;
        
        answer = n % slice == 0 ? n / slice : n / slice + 1;
        
        return answer;
    }
}