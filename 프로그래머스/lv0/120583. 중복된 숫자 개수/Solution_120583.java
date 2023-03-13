public class Solution_120583 {

    public static void main(String[] args) {
        // 예시
        int[] arr = {0,1,2,1,1,1};
        System.out.println("=======================");
        System.out.println(solution(arr,1));
        System.out.println("=======================");
    }

    public static int solution(int[] array, int n) {
        int answer = 0;

        for(int i=0; i < array.length; i++) {
            if(array[i] == n) {
                answer += 1;
            }
        }

        return answer;
    }
}