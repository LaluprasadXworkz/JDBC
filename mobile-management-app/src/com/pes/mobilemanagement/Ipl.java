package com.pes.mobilemanagement;

public class Ipl {

    String teamName;
    String captain;
    int noOfPlayers;
    String city;
    String ownerName;
    int noOfCups;
    String coach;
    int teamPoints;
    String toss;
    String matchStartingTime;

    public static void tossUpdate(String toss){
        System.out.println("Result :"+toss);
    }

    public static void matchStart(String matchStartingTime){
        System.out.println("Match Start at "+matchStartingTime);
    }

}
