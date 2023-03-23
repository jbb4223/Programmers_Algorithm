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
        StringBuilder s = new StringBuilder();

        for(int a : array) {
            s.append(a);
        }

        answer = s.toString().replaceAll("[^7]", "").length();

        return answer;
    }
}