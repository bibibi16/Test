package loop;

public class While1_5 {
    public static void main(String[] args) {
        // 1부터 하나씩 증가하는 수를 3번 더하기
        // while 문을 사용하지 않고

        int sum = 0;
        int i = 1;

        sum = sum + i;
        System.out.println("i=" + i + " sum = " + sum);
        i++;
        sum = sum + i;
        System.out.println("i=" + i + " sum = " + sum);
        i++;
        sum = sum + i;
        System.out.println("i=" + i + " sum = " + sum);
        i++;
    }
}
