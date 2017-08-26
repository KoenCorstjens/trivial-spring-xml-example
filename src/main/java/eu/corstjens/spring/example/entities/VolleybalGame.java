package eu.corstjens.spring.example.entities;


import org.springframework.beans.factory.annotation.Qualifier;


public class VolleybalGame implements Game{

    private Team home;

    private Team away;


    public VolleybalGame( Team home,  Team away) {
        this.home = home;
        this.away = away;
    }

    @Override
    public String playGame() {
        return Math.random() > 0.5 ? home.getName() : away.getName();
    }

}
