package FirstHomework.Competitors;

import FirstHomework.Competitors.Competitors.*;

public class Team1 {
    Competitor competitor[] = new Competitor[4];
    String name;

    public Team1(Competitor[] competitor, String name) {
        this.competitor = competitor;
        this.name = name;
    }

    public String getTeamName() {
        return name;
    }

    public Competitor[] getMembers() {
        return competitor;
    }

    public void showResults() {
        for (Competitor c : competitor
        ) {
            c.showResult();
        }
    }

    public void showMembersWhoHaveFinished(){
        for (Competitor c:competitor
             ) {
            if(c.isOnDistance()) c.showResult();
        }
    }
}
