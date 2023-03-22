import java.util.Arrays;
public class Solution_120896 {

    public static void main(String[] args) {
        // 예시
        int [] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("=======================");
        System.out.println(solution("abcabcadc"));
        System.out.println("=======================");
    }

    public static String solution(String s) {

        // 내풀이
        StringBuilder answer = new StringBuilder();
        String[] arr = s.split("");

        Arrays.sort(arr);

        for(String a : arr) {
            int count = 0;

            for(int i=0; i<s.length(); i++) {
                if (String.valueOf(s.charAt(i)).equals(a)) {
                    count++;
                }
            }

            answer.append(count == 1 ? a : "");
        }


        return answer.toString();

        // 다른사람풀이 => (이렇게 생각을 할수도 있구나)
//        int[] alpha = new int[26];
//        for(char c : s.toCharArray()){
//            alpha[c - 'a']++;
//        }
//
//        StringBuilder answer = new StringBuilder();
//        for(int i = 0; i < 26; i++){
//            if(alpha[i] == 1){
//                answer.append((char)(i + 'a'));
//            }
//        }
//        return answer.toString();
    }
}