package scanner;

import java.util.Scanner;

public class ScannerEx2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 : ");
        int number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.print("입력한 숫자 " + number + "짝수입니다.");


        } else {
            System.out.print("입력한 숫자" + number + "홀수입니다.");
        }
        }
}
