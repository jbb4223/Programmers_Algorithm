import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Solution_120852 {

    public static void main(String[] args) {
        // 예시
        int [] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("=======================");
        System.out.println(Arrays.toString(solution(12)));
        System.out.println("=======================");
    }

    public static int[] solution(int n) {
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