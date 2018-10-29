package com.company.sports;

public class Football extends Sports implements Game{
    private String teamName;

    public Football(String teamName) {
        this.teamName = teamName;
        Sports sports = new Sports();
        sports.setNumber(11);
        super.setSportName("Football");
    }

    public Football(){}

    @Override
    public void scoreCounter() {
        System.out.println("Score + 1");
    }

    @Override
    public void foul() {
        System.out.println("Foul committed");
    }

    @Override
    public void sub() {
        System.out.println("Player subbed");
    }

    @Override
    public void timer() {
        System.out.println("Time!!!");
    }

    public String getTeamName() {
        return teamName;
    }
}
