package cond.ex;

public class CondOpEx {
    public static void main(String[] args) {
        // a와 b를 가지고 있음
        // a는 10
        // b는 20
        // 삼항 연산자를 사용하여 더 큰 숫자를 출력

        int a = 10;
        int b = 20;

        int max = ( a > b ) ? a : b; // a가 b보다 > (크냐) ? a가 크면 a : b 가 크면 b
        System.out.println("더 큰 숫자는" + max + "입니다.");
    }
}
