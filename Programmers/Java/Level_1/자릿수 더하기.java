import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        char[] nChar = String.valueOf(n).toCharArray();
        
        for(int i = 0; i < nChar.length; i ++) {
            answer += nChar[i]-48;
        }

        return answer;
    }
}