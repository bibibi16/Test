package cond.ex;

public class StringGrageEx {

    public static void main(String[] args) {

        //학점에 따라 성취도를 출력하는 프로그램
        // A 탁월한 성과입니다
        // B 좋은 성과 입니다
        // C 준수한 성과입니다.
        // D 향상이 필요합니다.
        // F 불합격 입니다.
        // 나머지 잘못된 학점입니다.
      String grade = "D";
      switch (grade) {
          case "A" -> grade = "탁월한 성과입니다.";
          case "B" -> grade = "좋은 성과입니다.";
          case "C" -> grade = "준수한 성과입니다.";
          case "D" -> grade = "향상이 필요 합니다.";
          case "F" -> grade = "불합격 입니다.";
          default -> grade = "잘못된 학점입니다.";

      };
        System.out.println("성취도는 " + grade);

    }
}
