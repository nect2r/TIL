class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String xStr = String.valueOf(x);
        
        int sum = 0;
        
        for(int i = 0; i < xStr.length(); i++) {
            sum += xStr.charAt(i)-48;
        }
        
        if(x % sum != 0){
            answer = false;
        }
        
        return answer;
    }
}