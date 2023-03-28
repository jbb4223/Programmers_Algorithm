import java.util.Arrays;

public class Solution_120860 {

    public static void main(String[] args) {
        // 예시
        int [][] arr = {{-1, -1}, {1, 1}, {1, -1}, {-1, 1}};
//            int [] arr2 = {5, 5};
        System.out.println("=======================");
        System.out.println(solution(arr));
        System.out.println("=======================");
    }

    public static int solution(int[][] dots) {
            int answer = 0;
            int [] xArr = new int[dots.length];
            int [] yArr = new int[dots.length];
            int width = 0;
            int height = 0;

            for(int i=0; i<dots.length; i++) {
                xArr[i] = dots[i][0];
                yArr[i] = dots[i][1];
            }

            width = Arrays.stream(xArr).max().getAsInt() - Arrays.stream(xArr).min().getAsInt();
            height = Arrays.stream(yArr).max().getAsInt() - Arrays.stream(yArr).min().getAsInt();

            answer = width * height;

            return answer;
    }
}