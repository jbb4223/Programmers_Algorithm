import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {
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