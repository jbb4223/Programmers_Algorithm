import java.util.Arrays;
class Solution {
    public String solution(String s) {
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
    }
}