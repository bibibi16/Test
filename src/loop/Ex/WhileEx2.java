package loop.Ex;

public class WhileEx2 {
    public static void main(String[] args) {
        // 반복문을 사용하여 10개의 짝수
        // num이라는 변수 사용

        int num = 2;
        int count = 1;
        while (count <= 10){
            System.out.println(num);
            num += 2;
            count++;

        }
    }
}
