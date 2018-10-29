package com.company.sports;

public class MainFootball{
    public static void main(String[] args){
        Football a = new Football("Manchester United");

        System.out.println(a.getTeamName());
        System.out.println(a.getNumber());
        System.out.println(a.getTeamName() + " play " + a.getSportName());

        a.foul();
        a.scoreCounter();
        a.sub();
        a.timer();

        System.out.println();

        Basketball b = new Basketball("Golden State Warriors");

        System.out.println(b.getTeamName());
        System.out.println(b.getNumber());
        System.out.println(b.getTeamName() + " play " + b.getSportName());

        b.foul();
        b.scoreCounter();
        b.sub();
        b.timer();

    }
}
