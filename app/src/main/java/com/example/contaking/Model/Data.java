package com.example.contaking.Model;

//classe dei dati, qui si salveranno tutti i dati che richiedono una persistenza temporanea

public class Data {

    //salvare nomi dei giocatori
    private static String player1;
    private static String player2;
    private static String player3;
    private static String player4;

    //punteggi giocatori
    private static int player1point;
    private static int player2point;
    private static int player3point;
    private static int player4point;

    //variabili extra
    private static String domino;

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

    public static String getDomino() {
        return domino;
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

    public static void setDomino(String domino) {
        Data.domino = domino;
    }

    //metodi per aggiungere i punti
    public static void addPlayerpoin1(int point){
        Data.player1point += point;
    }

    public static void addPlayerpoin2(int point){
        Data.player2point += point;
    }

    public static void addPlayerpoin3(int point){
        Data.player3point += point;
    }

    public static void addPlayerpoin4(int point){
        Data.player4point += point;
    }

    //metodi per togliere punti
    public static void subPlapoint1(int point){
        Data.player1point -= point;
    }

    public static void subPlapoint2(int point){
        Data.player2point -= point;
    }

    public static void subPlapoint3(int point){
        Data.player3point -= point;
    }

    public static void subPlapoint4(int point){
        Data.player4point -= point;
    }

    //metodo per pulire i dati per una nuova partita
    public static void deleteData(){
        player1point = 0;
        player2point = 0;
        player3point = 0;
        player4point = 0;
        player1 = "";
        player2 = "";
        player3 = "";
        player4 = "";
    }

}
