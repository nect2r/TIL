class Solution {
    public long solution(long n) {
        //Math.sqrt(n) 은 제곱근을 구함..
        //만약 3이 들어오면 제곱근은 정수가아니라 실수가되서 0.0으로 나오지 않음
        //Math.pow(:1,:2) 를 통해서 :1은 제곱근 , :2는 몇번쨰제곱인지를 통해서
        //return을 함.. 아래경우는 Math.pow를 통해서 (제곱근+1,제곱할 수) 또는 -1
        return Math.sqrt(n) % 1 == 0.0 ? (long)Math.pow(Math.sqrt(n) + 1, 2) : -1;
    }
}