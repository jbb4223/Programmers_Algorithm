public class Solution_120851 {

    public static void main(String[] args) {
        // 예시
        System.out.println("=======================");
        System.out.println(solution("aAb1B2cC34oOp"));
        System.out.println("=======================");
    }

    public static int solution(String my_string) {
        int answer = 0;
        String anw;

        anw = my_string.replaceAll("[^\\d]", "");

        for(int i=0; i<anw.length(); i++) {
            answer += Integer.parseInt(String.valueOf(anw.charAt(i)));
        }


        return answer;
    }
}