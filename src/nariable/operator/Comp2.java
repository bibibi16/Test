package nariable.operator;

public class Comp2 {
  //문자열
    public static void main(String[] args) {
        String str1 = "문자열1";
        String str2 = "문자열2";
        
        //문자열 리터링 비교
        boolean result1 = "hello".equals("hello");
        
        //문자열 변수, 리터링 비교
        boolean result2 = str1.equals("문자열1");
        boolean result3 = str1.equals(str2);// 문자열 변수 비교

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    
    }
}
