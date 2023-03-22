public class Solution_120885 {

    public static void main(String[] args) {
        // 예시
        int [] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("=======================");
        System.out.println(solution("10","11"));
        System.out.println("=======================");
    }

    public static String solution(String bin1, String bin2) {
        String answer = "";
        int sum = Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2);


        answer = Integer.toBinaryString(sum);

        return answer;
    }
}