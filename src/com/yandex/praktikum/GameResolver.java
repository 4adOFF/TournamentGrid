package com.yandex.praktikum;

public class GameResolver {

    public String resolveGame(String gameResult, String[] players) {

        String[] points = gameResult.split(":");
        int fp = Integer.parseInt(points[0]);
        int sp = Integer.parseInt(points[1]);
        if (fp>sp) {
            return players[0];
        } else {
            return players[1];
        }

    }
}
