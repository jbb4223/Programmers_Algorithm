class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;
        
        
        for(int l : box) {
            answer = answer * (l / n);
        }
        
        return answer;
    }
}