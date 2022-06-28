package com.yandex.praktikum;

import java.util.concurrent.ThreadLocalRandom;

public class StubGenerator {
    static String[] firstNames = {"Jenny", "Leland", "June", "Verna", "Estelle", "Andrea", "Rex", "Domingo", "Tyler", "Pedro",
            "Blanca", "Harry", "Wilbert", "Doug", "Lucas", "Lorene", "Matthew", "Randal", "Dallas", "Maurice", "Christine",
            "Jennifer", "Arlene", "Ismael", "Willie", "Heidi", "Patricia", "Forrest", "Gabriel", "Tyrone", "Johnny",
            "Felix", "Bill", "Clinton", "Luther", "Andre", "Angel", "Erica", "Cory", "Esther", "Toby", "Leslie", "Charles",
            "Josephine", "Bernadette", "Robin", "Nelson", "Peggy", "Bertha", "Kayla"};
    static String[] secondNames = {"Ortiz", "Kennedy", "Conner", "Erickson", "Bowen", "Tucker", "Holt", "Castro", "Ruiz", "Tate",
            "Wheeler", "Mcguire", "White", "Barnett", "Allen", "Palmer", "Ryan", "Thomas", "Greer", "Wolfe", "Jordan",
            "Holmes", "Stewart", "Abbott", "Bush", "Page", "Sullivan", "Dawson", "Griffith", "Brewer", "Ramos", "Lindsey",
            "Moody", "Cooper", "Estrada", "Wilkins", "Hughes", "Marsh", "Lucas", "Blair", "Medina", "Nelson", "Guerrero",
            "Lynch", "Hodges", "Reyes", "Morrison", "Herrera", "Carr", "Waters"};


    public static String[] generatePlayers(Integer count) {
        String[] players = new String[count];
        for (int i=0; i < count; i++) {
            players[i] = firstNames[getRandomInt(0, firstNames.length - 1)] + secondNames[getRandomInt(0, secondNames.length-1)];
        }
        return players;
    }

    public static String generateMatch() {
        Integer int1 = getRandomInt(0, 10);
        Integer int2 = getRandomInt(0, 10);
        return int1 + ":" + int2;
    }


    private static Integer getRandomInt(Integer min, Integer max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

}
