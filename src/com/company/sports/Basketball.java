package com.company.sports;

public class Basketball extends Sports implements Game{
    private String teamName;

    public Basketball(){}

    public Basketball(String teamName){
        this.teamName = teamName;
        Sports sports = new Sports();
        sports.setNumber(5);
        super.setSportName("Basketball");
    }

    public String getTeamName() {
        return teamName;
    }

    @Override
    public void scoreCounter() {
        System.out.println("Basket made");
    }

    @Override
    public void foul() {
        System.out.println("Foul");
    }

    @Override
    public void sub() {
        System.out.println("Player subbed");
    }

    @Override
    public void timer() {
        System.out.println("Time!!!");
    }
}
