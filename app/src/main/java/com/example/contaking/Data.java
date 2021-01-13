package com.example.contaking;

//classe dei dati, qui si salveranno tutti i dati che richiedono una persistenza temporanea

public class Data {

    //salvare nomi dei giocatori
    public static String player1;
    public static String player2;
    public static String player3;
    public static String player4;

    //punteggi giocatori
    public static int player1point;
    public static int player2point;
    public static int player3point;
    public static int player4point;

    //metodi get
    public static int getPlayer1point() {
        return player1point;
    }

    public static int getPlayer2point() {
        return player2point;
    }

    public static int getPlayer3point() {
        return player3point;
    }

    public static int getPlayer4point() {
        return player4point;
    }

    public static String getPlayer1() {
        return player1;
    }

    public static String getPlayer2() {
        return player2;
    }

    public static String getPlayer3() {
        return player3;
    }

    public static String getPlayer4() {
        return player4;
    }

    //metodi set
    public static void setPlayer1(String player1) {
        Data.player1 = player1;
    }

    public static void setPlayer2(String player2) {
        Data.player2 = player2;
    }

    public static void setPlayer3(String player3) {
        Data.player3 = player3;
    }

    public static void setPlayer4(String player4) {
        Data.player4 = player4;
    }

    public static void setPlayer1point(int player1point) {
        Data.player1point = player1point;
    }

    public static void setPlayer2point(int player2point) {
        Data.player2point = player2point;
    }

    public static void setPlayer3point(int player3point) {
        Data.player3point = player3point;
    }

    public static void setPlayer4point(int player4point) {
        Data.player4point = player4point;
    }
}
