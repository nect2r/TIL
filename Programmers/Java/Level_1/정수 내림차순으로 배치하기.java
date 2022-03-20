class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String answerStr = String.valueOf(n);
        char[] answerChar = answerStr.toCharArray();
        
        //선택정렬 내림차순
        for(int i = 0; i < answerChar.length; i++) {
            for(int j = i+1; j < answerChar.length; j++) {
                if(answerChar[i] < answerChar[j]){
                    char tmp = answerChar[i];
                    answerChar[i] = answerChar[j];
                    answerChar[j] = tmp;
                }
            }
        }
        
        answerStr = String.valueOf(answerChar);
        
        return Long.parseLong(answerStr);
    }
}