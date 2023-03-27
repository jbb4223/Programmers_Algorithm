import java.util.Arrays;

public class Solution_120869 {

    public static void main(String[] args) {
        // 예시
        String [] arr = {"p", "o", "s"};
        String [] arr2 = {"so", "eocd", "qixm", "adio", "soo"};
        System.out.println("=======================");
        System.out.println(solution(arr, arr2));
        System.out.println("=======================");
    }

    public static int solution(String[] spell, String[] dic) {
            int answer = 0;
            String [] dicArr = {};

            Arrays.sort(spell);

            for(String s2 : dic) {
                dicArr = s2.split("");
                Arrays.sort(dicArr);
                if(Arrays.equals(spell, dicArr)) {
                    answer = 1;
                    break;
                } else {
                    answer = 2;
                    dicArr = new String[]{};
                }
            }

            return answer;
    }
}