import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> array = new ArrayList<>();

        int idx = 2;
        while (n > 1) {
            if (n % idx == 0) {
                if (!array.contains(idx)) {
                    array.add(idx);
                }
                n /= idx;
            } else {
                idx++;
            }
        }

        answer = array.stream().distinct().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}