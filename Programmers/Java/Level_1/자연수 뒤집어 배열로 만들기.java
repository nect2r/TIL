import java.util.Scanner;

class Solution {
    public int[] solution(long n) {
        
        String nStr = String.valueOf(n);
        char[] nChar = nStr.toCharArray();
        int[] answer = new int[nChar.length];
        int point = 0;
        
        for(int i = nChar.length-1; i >= 0; i--){
            answer[point] = nChar[i]-48;
            point++;
        }
        
        return answer;
    }
}