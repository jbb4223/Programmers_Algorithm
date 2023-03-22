public class Solution_120848 {

    public static void main(String[] args) {
        // 예시
//        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("=======================");
        System.out.println(solution(7));
        System.out.println("=======================");
    }

    public static int solution(int n) {
        int answer = 0;
        int sum = 1;
        int index = 1;

        do{
            index++;
            sum *= index;
            if(sum == n) {
                break;
            } else if (sum > n) {
                index--;
            }
        }
        while(n > sum);

        answer = index;

        return answer;
    }
}