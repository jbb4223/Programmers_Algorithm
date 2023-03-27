public class Solution_120894 {

    public static void main(String[] args) {
        // 예시
        int [] arr = {1, 2, 3};
        System.out.println("=======================");
        System.out.println(solution("onetwothreefourfivesixseveneightnine"));
        System.out.println("=======================");
    }

    public static long solution(String numbers) {
            // 나의 풀이
//            String answer = "";
//
//            String num = "";
//            String [] numArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
//
//            for(int i=0; i<numbers.length(); i++) {
//                num += numbers.charAt(i);
//                for(int j=0; j< numArr.length; j++) {
//                    if(num.equals(numArr[j])) {
//                        answer += j;
//                        num = "";
//                    }
//                }
//            }
//
//            return Long.parseLong(answer);


            // 훨씬 깔끔하고 괜찮은 풀이
            String[] numbers_arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

            for (int i = 0; i < numbers_arr.length; i++) {
                numbers = numbers.replaceAll(numbers_arr[i], String.valueOf(i));
            }

            long answer = Long.parseLong(numbers);
            return answer;
    }
}
