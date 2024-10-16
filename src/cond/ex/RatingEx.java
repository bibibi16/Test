package cond.ex;

public class RatingEx {
    public static void main(String[] args) {
        // 평점에 따른 영화 추천하기
        // 어바웃 타임 평점 9점
        // 토이스토리 평점 8점
        // 고질라 평점 7점

        double rating = 10;

        if (rating >= 9){
            System.out.println("어바웃 타임을 추천합니다.");
        } else if (rating >= 8) {
            System.out.println("어바웃 타임을 추천합니다.");
            System.out.println("토이 스토리를 추천합니다.");
        } else if (rating >= 7.1) {
            System.out.println("어바웃 타임을 추천합니다.");
            System.out.println("토이 스토리를 추천합니다.");
        } else if (rating >= 7) {
            System.out.println("어바웃 타임을 추천합니다.");
            System.out.println("토이 스토리를 추천합니다.");
            System.out.println("고질라를 추천합니다.");
        }
        }
}
