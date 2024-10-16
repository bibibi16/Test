package nariable.operator;

public class OperationExQ1 {

    // num1, num2, num3 이름 세개의 int 변수에 선언하고 각각 10, 20, 30으로 초기화
    // 세 변수의 합을 계산하고 그 결과를 sum이라는 이름의 int에 저장
    // 세 변수의 평균을 계산하고 average라는 이름의 int 변수에 저장
    // sum과 average의 변수의 값 출력

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        int sum = num1 + num2 + num3;
        int average = sum / 3;

        System.out.println(sum);
        System.out.println(average);


    }
}
