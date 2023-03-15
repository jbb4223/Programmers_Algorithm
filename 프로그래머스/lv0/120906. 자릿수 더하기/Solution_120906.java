public class Solution_120906 {

    public static void main(String[] args) {
        // 예시
        System.out.println("=======================");
        System.out.println(solution(1234));
        System.out.println("=======================");
    }

    public static int solution(int n) {
        int answer = 0;
        String anw;

        anw = Integer.toString(n);

        for(int i=0; i<anw.length(); i++) {
            answer += Integer.parseInt(String.valueOf(anw.charAt(i)));
        }


        return answer;
    }
}