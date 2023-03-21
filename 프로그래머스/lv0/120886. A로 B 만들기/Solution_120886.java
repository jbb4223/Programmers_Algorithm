import java.util.Arrays;

public class Solution_120886 {

    public static void main(String[] args) {
        // 예시
//        int [] arr = {4, 455, 6, 4, -1, 45, 6};
        System.out.println("=======================");
        System.out.println(solution("allpe","apple"));
        System.out.println("=======================");
    }

    public static int solution(String before, String after) {
        int answer = 0;
        String [] beforeArr = before.split("");
        String [] afterArr = after.split("");

        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);

        if(Arrays.equals(beforeArr, afterArr)) {
            answer = 1;
        } else {
            answer = 0;
        }

        return answer;
    }
}