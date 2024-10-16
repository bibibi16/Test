package casting;

public class casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long LongValue;
        double doubleValue;

        LongValue = intValue;
        System.out.println("LongValue = " + LongValue);

        doubleValue = intValue;
        System.out.println("doubleValue1 = " + doubleValue);

        doubleValue = 20L;
        System.out.println("doubleVelue2 = " + doubleValue);



    }
}
