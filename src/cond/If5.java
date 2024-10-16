package cond;

public class If5 {

    public static void main(String[] args) {
        // 온라인 쇼핑몰의 할인 시스템 개발
        // 사용자가 어떤 상품을 구매할 때, 다양한 할인 조건에 따라 총 할인 금액이 달라질 수 있음
        // 각각의 할인 조건
        // 아이템 가격이 10000원 이상일 때, 1000원 할인
        // 나이가 10살 이하일 때 1000원 할인
        // 이 할인 시스템의 핵심은 한 사용자가 동시에 여러 할인을 받을 수 있음
        // 10000원짜리 아이템을 구매할 때 1000원 할인 받고 동시에 나이가 10살 미만이면 추가로 1000원 할인

        int item = 10000;
        int age = 10;
        int discount = 0;

        if (item >= 10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인 됩니다");
        }

        if (age <= 10) {
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        }

        System.out.println("총할인 금액: " + discount + "원");
    }
}
