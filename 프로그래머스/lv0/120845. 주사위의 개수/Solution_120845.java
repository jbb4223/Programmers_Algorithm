public class Solution_120845 {

    public static void main(String[] args) {
        // 예시
        int[] arr = {10, 8, 6};
        System.out.println("=======================");
        System.out.println(solution(arr, 3));
        System.out.println("=======================");
    }

    public static int solution(int[] box, int n) {
        int answer = 1;
        
        
        for(int l : box) {
            answer = answer * (l / n);
        }
        
        return answer;
    }
}