public class Solution_120912 {

    public static void main(String[] args) {
        // 예시
        int [] arr = {7,77,17};
        System.out.println("=======================");
        System.out.println(solution(arr));
        System.out.println("=======================");
    }

    public static int solution(int[] array) {
        int answer = 0;
        String s = "";

        for(int a : array) {
            s += a;
        }

        answer = s.replaceAll("[^7]", "").length();

        return answer;
    }
}