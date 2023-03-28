public class Solution_120884 {

    public static void main(String[] args) {
        // 예시
        String [] arr = {"meosseugi", "1234"};
//            int [] arr2 = {5, 5};
        System.out.println("=======================");
        System.out.println(solution(1081));
        System.out.println("=======================");
    }

    public static int solution(int chicken) {
            int answer = 0;

            while(chicken / 10 != 0) {
                answer += chicken / 10;

                chicken = chicken / 10 + chicken % 10;
            }

            return answer;
    }
}