package scanner;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요 : ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요 : ");
        int num2 = scanner.nextInt();

        System.out.print("세 번째 숫자를 입력하세요 : ");
        int num3 = scanner.nextInt();

        int sum = num1 + num2 + num3;
        System.out.print("세 숫자의 합 : " + sum);

    }
}
