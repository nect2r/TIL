class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        
        for(int point : arr) {
            answer += point;
        }
        
        return answer / arr.length;
    }
}