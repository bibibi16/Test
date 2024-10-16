package cond.ex;

import cond.Switch4;

public class DistanceEx {

    public static void main(String[] args) {
        // 거리에 따른 운송 수단
        // 거리가 1km 이하면 도보
        // 거리가 10km 이하면 자전거
        // 거리가 1000km 이하면 자동차
        // 거리가 100km 초과면 비행기

        int disteance = 1000;

        if (disteance <= 1) {
            System.out.println("도보를 이용하세요");
        } else if (disteance <= 10) {
            System.out.println("자전거를 이용하세요");
        } else if (disteance <= 1000) {
            System.out.println("자동차를 이용하세요");
        } else {
            System.out.println("비행기를 이용하세요");
        }
    }
}
