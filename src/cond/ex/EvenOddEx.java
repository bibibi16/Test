package cond.ex;

public class EvenOddEx {
    public static void main(String[] args) {
        // 정수 x가 주어지면 x가 짝수
        // x가 홀수면 홀수를 출력 삼항 연산자 사용

        int x = 5;
        String result = (x % 2 == 0) ? "짝수" : "홀수";
        System.out.println("x는 " + result + "입니다.");
    }
}
