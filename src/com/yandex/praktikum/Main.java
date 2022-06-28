package com.yandex.praktikum;

public class Main {

    public static void main(String[] args) {
        final int playerCount = 10;
        String[] players = StubGenerator.generatePlayers(playerCount);
        String[][] arr = new String[playerCount][playerCount];

        for (int i=0; i<playerCount;i++) {
            for (int j = 0; j < playerCount; j++) {
                arr[i][j] = StubGenerator.generateMatch();
            }
        }


    }

}
