class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        for(int i=0; i<numbers.length; i++) {
            // right 일때
            if(direction.equals("right")) {
                if(i == 0) {
                    answer[i] = numbers[numbers.length-1];
                }
                else {
                    answer[i] = numbers[i-1];
                }
            }
            // left 일때
            else if (direction.equals("left")) {
                if(i == numbers.length-1) {
                    answer[i] = numbers[0];
                }
                else {
                    answer[i] = numbers[i+1];
                }
            }
        }

        return answer;
    }
}