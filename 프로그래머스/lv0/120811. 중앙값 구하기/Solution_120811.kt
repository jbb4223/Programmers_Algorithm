public class Solution_120811 {
    fun solution(array: IntArray): Int {
        var answer = 0

        // array int 배열 오름차순 정렬
        Arrays.sort(array)
        answer = array[array.size / 2]
        return answer
    }
}